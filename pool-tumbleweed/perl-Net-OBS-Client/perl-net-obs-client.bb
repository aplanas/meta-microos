SUMMARY = "Simple OBS API calls"
DESCRIPTION = "Net::OBS::Client aims to simplify usage of OBS \
(https://openbuildservice.org) API calls in perl."
LICENSE = "Artistic-2.0"

PV = "0.0.8"

RPM_NAME = "perl-Net-OBS-Client-0.0.8-1.11.noarch.rpm"
RPM_HASH = "3ecba8b9a7d70d3bbed0537461904631ddb46a3f5693ff4e86cfc5b513e67391e7ecf165f24863190a89b723ec77f6ebe0ee4bd95beb678882603ff90c7042be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--OBS--Client \
perl-Net--OBS--Client--BuildResults \
perl-Net--OBS--Client--DTD \
perl-Net--OBS--Client--Package \
perl-Net--OBS--Client--Project \
perl-Net--OBS--Client--Roles--BuildStatus \
perl-Net--OBS--Client--Roles--Client \
perl-Net-OBS-Client"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
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
