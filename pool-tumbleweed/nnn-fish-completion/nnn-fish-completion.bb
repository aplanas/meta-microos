SUMMARY = "Fish Completion for nnn"
DESCRIPTION = "The official fish completion script for nnn."
LICENSE = "BSD-2-Clause"

PV = "4.8"

RPM_NAME = "nnn-fish-completion-4.8-1.2.noarch.rpm"
RPM_HASH = "2733bf6be8de880a61ad49c9d3f4a0154d8e917df41d63eab0aefcaa73952e94bc09a83379d9c1442888b516e4e02058108aaafcfb3fd434a95ee88da7c6b7f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nnn-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
