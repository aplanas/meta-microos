SUMMARY = "Command-line wrapper for git and GitHub"
DESCRIPTION = "hub is a command line tool that wraps git in order to extend it with \
extra features and commands that make working with GitHub easier."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "hub-2.14.2-1.20.aarch64.rpm"
RPM_HASH = "106a6c54fac9abde1d8f9401cbab9be24ea4eeb0de56e9d1f29506eb5b5b9b07c19147e917f934bef8ed365e91b2c9969eb147556c1b549b8f8ff3196f828595"

RPROVIDES:${PN} += "hub \
rubygem-hub"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
