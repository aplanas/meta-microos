SUMMARY = "A GitLab command line tool"
DESCRIPTION = "glab is a command line tool bringing GitLab's features to the command line."
LICENSE = "MIT"

PV = "1.32.0"

RPM_NAME = "glab-1.32.0-1.1.aarch64.rpm"
RPM_HASH = "59a05e36bc6ae7794db952280bd1023ef5a20a07f3e55753b3fda6517f6cc26bd84724a652052619eb25b0c376a434e408f674da7f92129bd6d398f673201c04"

RPROVIDES:${PN} += "glab"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
