SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "python310-libregf-20230319-1.6.aarch64.rpm"
RPM_HASH = "d5f7f6a86c8eb4e5b6bbc4f84b9803d8c5607069e0844e77d7a3e7eadc61964ddf81643e5a91712da6d0a90aef67e4bf21809fad087d7929856f686be8281b59"

RPROVIDES:${PN} += "python310-libregf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libregf.so.1 \
python-abi"

inherit rpm
