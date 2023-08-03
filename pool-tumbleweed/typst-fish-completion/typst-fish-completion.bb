SUMMARY = "Fish Completion for typst"
DESCRIPTION = "Fish command-line completion support for typst."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "typst-fish-completion-0.6.0-1.1.noarch.rpm"
RPM_HASH = "094a8d9556859a2a5f0dce895c761d0c85f1590481ae8efe89fb166713fe1a1c7c7218bb666dc9b48adb0c4957ee68318e3a96f67ceb7abc08d4537193470f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "typst-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
