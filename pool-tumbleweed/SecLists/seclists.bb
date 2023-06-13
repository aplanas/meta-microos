SUMMARY = "SecLists is the security tester's companion"
DESCRIPTION = " \
SecLists is the security tester's companion. It's a collection of multiple \
types of lists used during security assessments, collected in one place. List \
types include usernames, passwords, URLs, sensitive data patterns, fuzzing \
payloads, web shells, and many more. The goal is to enable a security tester to \
pull this repository onto a new testing box and have access to every type of \
list that may be needed. \
 \
This project is maintained by Daniel Miessler, Jason Haddix, and g0tmi1k."
LICENSE = "MIT"

PV = "2022.4"

RPM_NAME = "SecLists-2022.4-1.2.aarch64.rpm"
RPM_HASH = "f06ea395ee8f75f2b270611f7db3fee02dd326832b97e4a274187dba53862f49451edd4bcb08edae1bfd13359d2198f8435134eff302c723117fc9fa8aa55f0f"

RPROVIDES:${PN} += "SecLists \
SecLists(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env"

inherit rpm
