SUMMARY = "Bash completion for ansifilter"
DESCRIPTION = "This package provides Bash command-line completion support for ansifilter."
LICENSE = "GPL-3.0-or-later"

PV = "2.20"

RPM_NAME = "ansifilter-bash-completion-2.20-1.1.noarch.rpm"
RPM_HASH = "9fde129186ce55347da58b587e94f2e20d5ab51547a3a167b7d5f36b830132b70b3a5bceb7ab2b2237a82612c02f1180d9ad9fa6856d03b0e1c0f364252666a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansifilter-bash-completion"

RDEPENDS:${PN} += "ansifilter \
bash-completion"

inherit rpm
