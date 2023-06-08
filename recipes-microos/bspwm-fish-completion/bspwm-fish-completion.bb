SUMMARY = "Fish Completion for bspwm"
DESCRIPTION = "Fish completion for bspc"
LICENSE = "BSD-2-Clause"

PV = "0.9.10"

RPM_NAME = "bspwm-fish-completion-0.9.10-1.11.noarch.rpm"
RPM_HASH = "44250dd6a39d0469c537a048be20fef5e92050f4bcbc72213680a474df9c6d7fd92423f8f4c6f95172a447bc1d43e72b8592d6b8231a775bace950388b3c3b0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bspwm-fish-completion"
RDEPENDS:${PN} += "bspwm"

inherit rpm
