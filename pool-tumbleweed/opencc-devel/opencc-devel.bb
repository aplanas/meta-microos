SUMMARY = "Open Chinese Convert"
DESCRIPTION = "OpenCC is an opensource project for conversion between Traditional \
Chinese and Simplified Chinese, which supports phrase-level conversion \
and regional idioms among Mainland China, Taiwan and Hong kong. \
 \
This package provides development headers for OpenCC."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "opencc-devel-1.1.6-1.4.aarch64.rpm"
RPM_HASH = "98fa88bf42b323d1c37f68b77bc7723de21eb23d1a7cafe16ef41c31f061ba0b8602bb8f92321d895ec627a0a4486ff7aed5a2db466b9fb88fd339c8417ec6c7"

RPROVIDES:${PN} += "opencc-devel \
pkgconfig-opencc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
opencc"

inherit rpm
