SUMMARY = "Web backend for python39-matplotlib"
DESCRIPTION = "This package includes the browser-based webagg backend \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-web-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "75602299890de15a93ca39ee1a5e9ddf85c8d1d06d4f7b6e411cb17cf50fcbfa8284e390d9762cfa8af5c6350d1ce75c454cd222050fc35c52bd17a64073ffde"

RPROVIDES:${PN} += "python39-matplotlib-web"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-tornado"

inherit rpm
