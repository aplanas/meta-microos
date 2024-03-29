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

RPM_NAME = "dd_rescue-lzo-1.99.13-2.3.aarch64.rpm"
RPM_HASH = "c7bbe4cb8f0fa5684ad12d94339294df48bb59139f2e114e8e1b349696a809048031cf0bb346ef5a32cea5de6093c8f5fd2ebce0618223212de70550fae95371"

RPROVIDES:${PN} += "dd-rescue-lzo \
libddr-lzo.so"

RDEPENDS:${PN} += "dd-rescue \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzo2.so.2"

inherit rpm
