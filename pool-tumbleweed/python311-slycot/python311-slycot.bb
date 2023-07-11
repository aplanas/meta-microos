SUMMARY = "A wrapper for the SLICOT control and systems library"
DESCRIPTION = "Slycot is a wrapper for the SLICOT control and systems library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "python311-slycot-0.5.4-1.2.aarch64.rpm"
RPM_HASH = "a02d0ccd413597dfb4f9e0eb49a798075c9247c878020efb77857f371193ffd1235c37086ad59a30aab4d463493a182e86476495f273ca0391c27af9cf43dfdd"

RPROVIDES:${PN} += "python3-slycot \
python3.11dist-slycot \
python311-slycot \
python3dist-slycot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
python-abi \
python311-numpy"

inherit rpm
