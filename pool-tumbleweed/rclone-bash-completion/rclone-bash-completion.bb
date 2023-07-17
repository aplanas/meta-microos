SUMMARY = "Bash Completion for rclone"
DESCRIPTION = "Bash command line completion support for rclone."
LICENSE = "MIT"

PV = "1.63.0"

RPM_NAME = "rclone-bash-completion-1.63.0-2.1.noarch.rpm"
RPM_HASH = "d27042d715495c9a470a89ffa2fb554296b605beb24ec3d7ca02d0a24e4dece6e8a243a9fbd6be40572c3302a8644da01ae1b2582b21f8021724b58c7cf66b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rclone-bash-completion"

RDEPENDS:${PN} += "rclone"

inherit rpm
