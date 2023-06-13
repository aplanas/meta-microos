SUMMARY = "Redundancy compressor for Doom WAD files"
DESCRIPTION = "WADptr is a utility for reducing the size of Doom WAD files. The \
'compressed' WADs will still work the same as the originals. The \
program works by exploiting the WAD file format to combine repeated / \
redundant material."
LICENSE = "GPL-2.0+"

PV = "2.4"

RPM_NAME = "wadptr-2.4-13.26.aarch64.rpm"
RPM_HASH = "32df5eb4fa9d07c208af164fcfc6c7136168c40487c11a2cf73e0c75eded88458196823d82d1a8da7bbc2ac2a40de0cbf1bc405f450298d314697f040432a212"

RPROVIDES:${PN} += "wadptr \
wadptr(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
