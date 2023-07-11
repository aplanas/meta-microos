SUMMARY = "A simple Django application to demonstrate RRD plots"
DESCRIPTION = "django-collectd-rest is a simple Django application to demonstrate RRD plots generated by collectd or any other rrd data. \
The application is built on top of django-rest-framework and provides REST API to access the plots."
LICENSE = "BSD-2-Clause"

PV = "0.2.4"

RPM_NAME = "python311-django-collectd-rest-0.2.4-1.5.aarch64.rpm"
RPM_HASH = "0e5264326ec46053b530f80c792b9551babace54d8a00a669b4917937bcecf0301f9231c8312cdfa5c7e190a2752fb66cea37fcb2bc42ab2bad25ab6aa26606b"

RPROVIDES:${PN} += "python3-django-collectd-rest \
python3.11dist-django-collectd-rest \
python311-django-collectd-rest \
python3dist-django-collectd-rest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
python-abi \
python311-Django \
python311-djangorestframework \
rrdtool"

inherit rpm
