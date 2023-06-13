SUMMARY = "Python 3.9 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python 3.9 applications via the WSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "python39-uwsgi-python3-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "bd16e5d38307332baddb9772a420f97c647dfa2ac3817f753d1dc388cb40866d05c151fe45d08c112e942c298232e9d8fb0bcf7fa4059054cc77440a3a9f363f"

RPROVIDES:${PN} += "python39-uwsgi-python3 \
python39-uwsgi-python3(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpython3.9.so.1.0()(64bit) \
python(abi) \
uwsgi"

inherit rpm
