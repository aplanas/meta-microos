SUMMARY = "A generic message storing mechanism"
DESCRIPTION = "Log::Message is a generic message storage mechanism. It allows you to store \
messages on a stack -- either shared or private -- and assign meta-data to \
it. Some meta-data will automatically be added for you, like a timestamp \
and a stack trace, but some can be filled in by the user, like a tag by \
which to identify it or group it, and a level at which to handle the \
message (for example, log it, or die with it) \
 \
Log::Message also provides a powerful way of searching through items by \
regexes on messages, tags and level."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Log-Message-0.08-3.27.noarch.rpm"
RPM_HASH = "ead376a8f04fd57f34ffe8001e64f31d028042d74aee1246fd3367146528bd03d5f0ff8afd1a277364c8667dd486db89832964e96fb14a641c64cc4dc9fba717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Message \
perl-Log--Message--Config \
perl-Log--Message--Handlers \
perl-Log--Message--Item \
perl-Log-Message"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Locale--Maketext--Simple \
perl-Module--Load \
perl-Params--Check"

inherit rpm
