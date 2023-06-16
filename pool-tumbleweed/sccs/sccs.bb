SUMMARY = "Source Code Control System"
DESCRIPTION = "Source Code Control System (SCCS) is a version control system for \
tracking changes in source code and other text files during the \
development of a piece of software. This allows the user to retrieve \
any of the previous versions of the original source code and the \
changes which are stored."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "sccs-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "e41be32ebe8709b253816bd7de4ba15b6c01371f04e97f9f2c5b0daae41be43fd44f97c893ae62978c90be0d1408565c286049326e80270cd558f80fe571515d"

RPROVIDES:${PN} += "sccs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
