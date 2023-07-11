SUMMARY = "Translations for package gkrellm"
DESCRIPTION = "Provides translations for the 'gkrellm' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.11"

RPM_NAME = "gkrellm-lang-2.3.11-2.11.noarch.rpm"
RPM_HASH = "6d142e5fa5515a93511779983b550045632dfafccb385f9a4231db4ab3ea9ac7172970f10512db164792f85304ff4d91356ce73b8a97f6c4ee99fc63a17b21e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gkrellm-lang \
gkrellm-lang-all \
locale-gkrellm-bg \
locale-gkrellm-cs \
locale-gkrellm-da \
locale-gkrellm-de \
locale-gkrellm-es \
locale-gkrellm-fr \
locale-gkrellm-it \
locale-gkrellm-ja \
locale-gkrellm-nl \
locale-gkrellm-pl \
locale-gkrellm-pt \
locale-gkrellm-pt-BR \
locale-gkrellm-ru \
locale-gkrellm-sl \
locale-gkrellm-sv \
locale-gkrellm-uk"

RDEPENDS:${PN} += "gkrellm"

inherit rpm
