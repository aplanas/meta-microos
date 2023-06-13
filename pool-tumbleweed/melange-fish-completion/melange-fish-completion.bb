SUMMARY = "Fish Completion for melange"
DESCRIPTION = "Fish command line completion support for melange."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "melange-fish-completion-0.3.2-1.2.noarch.rpm"
RPM_HASH = "b91fe051c8c24cbcc9553661b55904b48f2d5220dabdf1e8f69f730c977260cbfa6057f01128af9055d2b48836c048675b3e380ddb5183b8ca9731a2579da3bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "melange-fish-completion"

RDEPENDS:${PN} += "melange"

inherit rpm
