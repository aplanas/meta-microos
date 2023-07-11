SUMMARY = "Tools for Converting from and to the Tagged Image File Format"
DESCRIPTION = "This package contains the library and support programs for the TIFF \
image format."
LICENSE = "HPND"

PV = "4.5.1"

RPM_NAME = "tiff-4.5.1-1.1.aarch64.rpm"
RPM_HASH = "c222c25af4e3751d45c959a26375eab27608388e081fdea9fd27e8e47f76ccdf274c35a4e9828b773627f5972d1a08de6a8263176b209f101a25c9e6164753cf"

RPROVIDES:${PN} += "tiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtiff.so.6"

inherit rpm
