SUMMARY = "A command-line fuzzy finder"
DESCRIPTION = "fzf is an interactive Unix filter for command-line that can be used with any list; files, \
command history, processes, hostnames, bookmarks, git commits, etc."
LICENSE = "MIT"

PV = "0.42.0"

RPM_NAME = "fzf-0.42.0-1.2.aarch64.rpm"
RPM_HASH = "aff04efdfd9a18a318e82995dd12896ec85643b243e7634ee6483753292dae12223b09f73936dca9e4fbe27b3a5ff8e95be5069b94d0513b01ec2b60ee645c40"

RPROVIDES:${PN} += "fzf"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
