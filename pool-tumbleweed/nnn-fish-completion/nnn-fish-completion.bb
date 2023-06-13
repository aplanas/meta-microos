SUMMARY = "Fish Completion for nnn"
DESCRIPTION = "The official fish completion script for nnn."
LICENSE = "BSD-2-Clause"

PV = "4.8"

RPM_NAME = "nnn-fish-completion-4.8-1.1.noarch.rpm"
RPM_HASH = "b80320ded9a06ce24d6f3d8c7ac5ee104018895d427ca13a0076cb5f505c05bef8dbf3b8d891659a4a1069b648ccc3f4ae7a85c944547ace47da96121ffc4c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nnn-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
