SUMMARY = "A Display Filter for RFC822 Messages"
DESCRIPTION = "t-prot detects and, when demanded, hides annoying parts in rfc822 \
messages: TOFU (see below), huge quoted blocks, signatures (especially \
when they are too long), excessive punctuation, blocks of empty lines, \
and trailing spaces and tabs. For use inside of MTAs or MDAs, it may \
exit with appropriate libc exit codes, so annoying messages may be \
bounced easily. \
 \
TOFU is an abbreviation that mixes German and English words. It expands \
to 'text oben, full-quote unten' that means 'text above - full quote \
below' and describes the style of many users who let their mailer or \
newsreader quote everything of the previous message and just add some \
text at the top."
LICENSE = "BSD-4-Clause"

PV = "3.4"

RPM_NAME = "t-prot-3.4-1.16.noarch.rpm"
RPM_HASH = "6aff44419d2fb81dcbfc816cdfa53f4f737ee8a712580a1db106512e51cb8deb0e924195b7d01e2409c641cdf607a08b4b09105c6b327291b4600d230f96a136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "t-prot"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(Getopt::Long) \
perl(Locale::gettext)"

inherit rpm
