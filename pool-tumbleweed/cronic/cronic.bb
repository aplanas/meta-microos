SUMMARY = "A cure for Cron's chronic email problem"
DESCRIPTION = "Cronic is a small shim shell script for wrapping cron jobs so that cron only \
sends email when an error has occurred. Cronic defines an error as any non- \
trace error output or a non-zero result code. Cronic filters Bash execution \
traces (or anything matching PS4) from the error output, so jobs can be run \
with execution tracing to aid forensic debugging. Cronic has no options, it \
simply executes its arguments."
LICENSE = "SUSE-Public-Domain"

PV = "3"

RPM_NAME = "cronic-3-1.16.noarch.rpm"
RPM_HASH = "613fd042b850ed6ab991e786c8e8f41dfa1191acbb9d65670c1f4476cb135f0964765101b8b792db19e5671b37f675380c15cb9cc3ed1c6cf66ce9e5b82d0275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cronic"

RDEPENDS:${PN} += ""

inherit rpm
