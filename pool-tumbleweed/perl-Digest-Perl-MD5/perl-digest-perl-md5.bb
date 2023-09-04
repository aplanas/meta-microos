SUMMARY = "Perl implementation of Ron Rivests MD5 Algorithm"
DESCRIPTION = "This modules has the same interface as the much faster 'Digest::MD5'. So \
you can easily exchange them, e.g. \
 \
	BEGIN { \
	  eval { \
	    require Digest::MD5; \
	    import Digest::MD5 'md5_hex' \
	  }; \
	  if ($@) { # ups, no Digest::MD5 \
	    require Digest::Perl::MD5; \
	    import Digest::Perl::MD5 'md5_hex' \
	  } \
	} \
 \
If the 'Digest::MD5' module is available it is used and if not you take \
'Digest::Perl::MD5'. \
 \
You can also install the Perl part of Digest::MD5 together with \
Digest::Perl::MD5 and use Digest::MD5 as normal, it falls back to \
Digest::Perl::MD5 if it cannot load its object files. \
 \
For a detailed Documentation see the 'Digest::MD5' module."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.9"

RPM_NAME = "perl-Digest-Perl-MD5-1.9-3.28.noarch.rpm"
RPM_HASH = "5e95057d3597fe41995b1c08aec3d0a9bdbc82eb010d0469d6d26b9c7c6f241f9dc44ec2097269f4e9d011e72877a4d39d908193332b9ada97c62345f93aa662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Digest--Perl--MD5 \
perl-Digest-Perl-MD5"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
