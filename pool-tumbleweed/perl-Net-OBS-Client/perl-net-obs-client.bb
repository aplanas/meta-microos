SUMMARY = "Simple OBS API calls"
DESCRIPTION = "Net::OBS::Client aims to simplify usage of OBS \
(https://openbuildservice.org) API calls in perl."
LICENSE = "Artistic-2.0"

PV = "0.0.8"

RPM_NAME = "perl-Net-OBS-Client-0.0.8-1.12.noarch.rpm"
RPM_HASH = "082a861763c161969a7986a4004d684aabaa9262562b4575d11a5371e1d184fbe4cfd7b062bd261f14ae8580a316a73677d93c993f25636fffd0e3d7bed93c45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--OBS--Client \
perl-Net--OBS--Client--BuildResults \
perl-Net--OBS--Client--DTD \
perl-Net--OBS--Client--Package \
perl-Net--OBS--Client--Project \
perl-Net--OBS--Client--Roles--BuildStatus \
perl-Net--OBS--Client--Roles--Client \
perl-Net-OBS-Client"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Config--INI--Reader \
perl-Config--Tiny \
perl-HTTP--Cookies \
perl-HTTP--Request \
perl-LWP--UserAgent \
perl-Moose \
perl-Moose--Role \
perl-Path--Class \
perl-URI--URL \
perl-XML--Structured"

inherit rpm
