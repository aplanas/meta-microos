SUMMARY = "Binary files of authorindex"
DESCRIPTION = "Binary files of authorindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18790"

RPM_NAME = "texlive-authorindex-bin-2023.20230311.svn18790-93.1.aarch64.rpm"
RPM_HASH = "bb3db7d380c9ec8533e1bb062ebd298fb5f74e1c0892871cb3ff4f6d5f09341869a6297a1c90b04e248bd3fa111e41b4186faaf5d97a28023c7953ff84382de7"

RPROVIDES:${PN} += "texlive-authorindex-bin"

RDEPENDS:${PN} += "texlive-authorindex"

inherit rpm
