SUMMARY = "LZO plugin for dd_rescue"
DESCRIPTION = "This plugin allows you do de/compress files during recovery copying \
with dd_rescue using the lzo family of algorithms. lzo algorithms \
are very fast to decompress and most algorithms are very fast to \
compress as well -- at the expense of somewhat worse compression than \
zlib's deflate. \
 \
The plugin does offer a variety of options to handle corrupted .lzo \
files with some grace; it does skip over bad blocks (if the block \
headers are still intact) by default, but does offer an option (nodiscard) \
to allow to attempt decompression on faulty input, hoping to produce \
some usable bytes. It can also search for valid block headers after \
synchronization has been lost due to a corrupt one. \
 \
The plugin also handles sparse files (files with holes) and supports \
appending to .lzo files, so it fits neatly into dd_rescue. \
 \
Some fuzz testing has been applied to the plugin's decompression routines, \
though more will have to be done to feel confident about feeding untrusted \
data to the decompressor; the plugin is still young and might expose bugs."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.99.13"

RPM_NAME = "dd_rescue-lzo-1.99.13-2.2.aarch64.rpm"
RPM_HASH = "16d49e1c54a7c3ff70a4012776fdcbaa65f7ad2c5d31998896927acf6f5fdc25fd6e37dc318ee248fcc40de8ac4100f2c58739c2a25330d94693d5b93550f389"

RPROVIDES:${PN} += "dd_rescue-lzo \
dd_rescue-lzo(aarch-64) \
libddr_lzo.so()(64bit)"
RDEPENDS:${PN} += "dd_rescue \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
liblzo2.so.2()(64bit)"

inherit rpm
