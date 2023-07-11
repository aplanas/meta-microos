SUMMARY = "Zsh shell manual in HTML format"
DESCRIPTION = "The zsh shell is a command interpreter usable as an interactive login \
shell and as a shell script command processor.  Zsh resembles the ksh \
shell (the Korn shell), but includes many enhancements.  Zsh supports \
command line editing, built-in spelling correction, programmable \
command completion, shell functions (with autoloading), a history \
mechanism, and more. \
 \
This package contains the Zsh manual in HTML format."
LICENSE = "MIT"

PV = "5.9"

RPM_NAME = "zsh-htmldoc-5.9-5.4.aarch64.rpm"
RPM_HASH = "db6ec5d23e0fb22d3a7a44948ebfbffcf772832a53f39e0434c1bcc4865c0c6803ff7b6ead38e5a967508f51cbe09f559a195c641f8f7d9352a5ad36b2f0c9c7"

RPROVIDES:${PN} += "zsh-html \
zsh-htmldoc"

RDEPENDS:${PN} += ""

inherit rpm
