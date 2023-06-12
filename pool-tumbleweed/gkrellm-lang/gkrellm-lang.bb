SUMMARY = "Translations for package gkrellm"
DESCRIPTION = "Provides translations for the 'gkrellm' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.11"

RPM_NAME = "gkrellm-lang-2.3.11-2.10.noarch.rpm"
RPM_HASH = "7a05da9941f9a74ca2206fefe39de2b3958d425913898a008ba082fe2c32bc5c53c7a79ab0582c2bc0706f81e7c62206406ea2ffae0dde489d99036d2a617596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gkrellm-lang \
gkrellm-lang-all \
locale(gkrellm:bg) \
locale(gkrellm:cs) \
locale(gkrellm:da) \
locale(gkrellm:de) \
locale(gkrellm:es) \
locale(gkrellm:fr) \
locale(gkrellm:it) \
locale(gkrellm:ja) \
locale(gkrellm:nl) \
locale(gkrellm:pl) \
locale(gkrellm:pt) \
locale(gkrellm:pt_BR) \
locale(gkrellm:ru) \
locale(gkrellm:sl) \
locale(gkrellm:sv) \
locale(gkrellm:uk)"
RDEPENDS:${PN} += "gkrellm"

inherit rpm
