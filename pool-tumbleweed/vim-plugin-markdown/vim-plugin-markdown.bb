SUMMARY = "Markdown support for vim"
DESCRIPTION = "Syntax highlighting, matching rules and mappings for the original Markdown and \
extensions."
LICENSE = "MIT"

PV = "2.0.0+20220926"

RPM_NAME = "vim-plugin-markdown-2.0.0+20220926-55.1.noarch.rpm"
RPM_HASH = "2e43dc97c1243cc3100c25029e361ed3cecc3ef0af6d71c6dd451ca2fff76532dc70db63b193ca85510c855c8ecb760616b93b3a5302e6e9798973374b93f344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-markdown"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
