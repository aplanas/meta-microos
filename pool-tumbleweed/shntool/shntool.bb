SUMMARY = "Multi-purpose WAVE data processing and reporting utility"
DESCRIPTION = "shntool is a multi-purpose WAVE data processing and reporting \
utility. File formats are abstracted from its core, so it can process \
any file that contains WAVE data, compressed or not - provided there \
exists a format module to handle that particular file type. \
 \
shntool has native support for .wav files. Working with other \
lossless audio formats requires appropriate helper programs."
LICENSE = "GPL-2.0"

PV = "3.0.10"

RPM_NAME = "shntool-3.0.10-2.18.aarch64.rpm"
RPM_HASH = "a345216ba02683f3aa151abb210244aaff4e15e70aa5df9359c6d883f12bbcb6d45a1810aa0c97fc2e87e80560641338010c8caf072f5a128da9ddc08440a6d2"

RPROVIDES:${PN} += "shntool \
shntool(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
