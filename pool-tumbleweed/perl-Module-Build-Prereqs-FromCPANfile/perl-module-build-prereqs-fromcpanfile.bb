SUMMARY = "Construct prereq parameters of Module::Build from cpanfile"
DESCRIPTION = "This simple module reads cpanfile and converts its content into valid \
prereq parameters for 'new()' method of Module::Build. \
 \
Currently it does not support 'optional features' specification (See \
cpanfile/feature)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-Module-Build-Prereqs-FromCPANfile-0.02-1.13.noarch.rpm"
RPM_HASH = "81f53ebbbbbc084141b31435117fffaf0e01fde724ec3f65dbf7631c640a62687cfb1dbc2f73b314fe9699bb7a49d1f4b3c9cb9f0a5b8a63b2efed79ff40f208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Build--Prereqs--FromCPANfile \
perl-Module-Build-Prereqs-FromCPANfile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-CPAN--Meta--Prereqs \
perl-Module--CPANfile \
perl-version"

inherit rpm
