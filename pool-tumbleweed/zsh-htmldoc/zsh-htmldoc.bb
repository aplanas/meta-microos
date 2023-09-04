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

RPM_NAME = "zsh-htmldoc-5.9-6.1.aarch64.rpm"
RPM_HASH = "79b79f89a6fb01efae71d94040059e9704facfc6e03e0f41a0977413f3a194b6fad7c10db633570ba8740a0146eefcb45f85f31bdc70926db00328658ac96463"

RPROVIDES:${PN} += "zsh-html \
zsh-htmldoc"

RDEPENDS:${PN} += ""

inherit rpm
