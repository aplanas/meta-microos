SUMMARY = "Git remote helper for repositories stored on Keybase"
DESCRIPTION = " \
A git remote helper that allows storing Git repositories using Keybase. \
Repositories can be completely private or bound to a team. \
Repositories using this remote helper use the scheme keybase://."
LICENSE = "BSD-3-Clause"

PV = "6.0.2"

RPM_NAME = "kbfs-git-6.0.2-3.5.aarch64.rpm"
RPM_HASH = "bec698c794fc41aae0a5cd3349669b2a570714adc7817f66183c84c403cb8cb21e51bfabba197c3481f81a762e4b0efd7fa11580bf24cb33c5c77cf61349e2f0"

RPROVIDES:${PN} += "kbfs-git"

RDEPENDS:${PN} += "kbfs \
keybase-client"

inherit rpm
