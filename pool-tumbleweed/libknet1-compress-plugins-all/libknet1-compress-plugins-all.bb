SUMMARY = "Provides libknet1 compress plugins meta package"
DESCRIPTION = " Meta package to install all of libknet1 compress plugins"
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libknet1-compress-plugins-all-1.21-1.10.aarch64.rpm"
RPM_HASH = "43447f70964621664165a89402041eb09c1050d8b9a9576cda95573ff8735c51eed11bb9946b1501ea77c83ad57f0c186dbfb875a6ef6e6418448b8afd24ef7b"

RPROVIDES:${PN} += "libknet1-compress-plugins-all \
libknet1-compress-plugins-all(aarch-64)"

RDEPENDS:${PN} += "libknet1-compress-bzip2-plugin(aarch-64) \
libknet1-compress-lz4-plugin(aarch-64) \
libknet1-compress-lzma-plugin(aarch-64) \
libknet1-compress-lzo2-plugin(aarch-64) \
libknet1-compress-zlib-plugin(aarch-64) \
libknet1-compress-zstd-plugin(aarch-64)"

inherit rpm
