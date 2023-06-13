SUMMARY = "Distributed, offline-first bug tracker embedded in git, with bridges"
DESCRIPTION = "git-bug is a bug tracker that: \
 \
* is fully embedded in git: you only need your git repository to have \
  a bug tracker \
* is distributed: use your normal git remote to collaborate, push and \
  pull your bugs! \
* works offline: in a plane or under the sea? Keep reading and \
  writing bugs! \
* prevents vendor lock-in: your usual service is down or went bad? \
  You already have a full backup. \
* is fast: listing bugs or opening them is a matter of \
  milliseconds \
* doesn't pollute your project: no files are added in your \
  project \
* integrates with your tooling: use the UI you like (CLI, \
  terminal, web) or integrate with your existing tools through \
  the CLI or the GraphQL API \
* bridges to other bug trackers: use bridges to import and export \
  to other trackers."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "git-bug-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "3b4f3125e00e7f7450afcc676ae8d9abcfdbab69ea1f6b81519bbac4d75e7a75fc4bfa1e7b8bc08a45f8647f22797e7f1ef4ab4633173f7d0d615d840daa66d7"

RPROVIDES:${PN} += "git-bug \
git-bug(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
