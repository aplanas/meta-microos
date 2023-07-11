SUMMARY = "Testing-specific WWW::Mechanize subclass"
DESCRIPTION = "Testing-specific WWW::Mechanize subclass"
LICENSE = "Artistic-2.0"

PV = "1.60"

RPM_NAME = "perl-Test-WWW-Mechanize-1.60-1.3.noarch.rpm"
RPM_HASH = "5bb8ad1cb0fb36d3db441807d56ec2b28bd8f8040cd49f3951be84f22cd013fe68c6e5d33629a48db96a7e4554c84c96f45f6caeb0ca82b214676740bf612bd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--WWW--Mechanize \
perl-Test-WWW-Mechanize"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Carp--Assert--More \
perl-HTML--Form \
perl-HTML--TokeParser \
perl-HTTP--Message \
perl-LWP \
perl-Test--LongString \
perl-WWW--Mechanize \
perl-parent"

inherit rpm
