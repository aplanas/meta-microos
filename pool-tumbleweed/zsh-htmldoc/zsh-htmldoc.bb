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

RPM_NAME = "zsh-htmldoc-5.9-5.3.aarch64.rpm"
RPM_HASH = "5a4b71fe5495dc652ec05156890a485e3a77a87ab2ac1b619102e5dd3ee510d42752fef858e83abb33bd1b4410ca89189a18e27bca684ece62ab2e60b1fd744d"

RPROVIDES:${PN} += "zsh-html \
zsh-htmldoc"

RDEPENDS:${PN} += ""

inherit rpm
