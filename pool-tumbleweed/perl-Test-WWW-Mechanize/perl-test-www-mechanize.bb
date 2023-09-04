SUMMARY = "Testing-specific WWW::Mechanize subclass"
DESCRIPTION = "Testing-specific WWW::Mechanize subclass"
LICENSE = "Artistic-2.0"

PV = "1.60"

RPM_NAME = "perl-Test-WWW-Mechanize-1.60-1.4.noarch.rpm"
RPM_HASH = "826be456909448f0ad180a9a7d8e2f391b9cb3a307d377a2aab696d3f59dfea866910dca2ef6cf28ea762e5b833d3cf177032b5f050ee3f3093c5e6d517cd89b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--WWW--Mechanize \
perl-Test-WWW-Mechanize"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Carp--Assert--More \
perl-HTML--Form \
perl-HTML--TokeParser \
perl-HTTP--Message \
perl-LWP \
perl-Test--LongString \
perl-WWW--Mechanize \
perl-parent"

inherit rpm
