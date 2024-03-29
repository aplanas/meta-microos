SUMMARY = "Use other catalog formats in Maketext"
DESCRIPTION = "This module provides lexicon-handling modules to read from other \
localization formats, such as _Gettext_, _Msgcat_, and so on. \
 \
If you are unfamiliar with the concept of lexicon modules, please consult \
the Locale::Maketext manpage and the 'webl10n' HTML files in the 'docs/' \
directory of this module. \
 \
A command-line utility the xgettext.pl manpage is also installed with this \
module, for extracting translatable strings from source files."
LICENSE = "MIT"

PV = "1.00"

RPM_NAME = "perl-Locale-Maketext-Lexicon-1.00-1.28.noarch.rpm"
RPM_HASH = "7d4ab2a74b220be0885f418f9b3bb95afb7f7362dc182a9afc92b982ad04ea729883c02e116fb47ba27687734750e823e54644429f828d272d9ff30f92e4b91c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Locale--Maketext--Extract \
perl-Locale--Maketext--Extract--Plugin--Base \
perl-Locale--Maketext--Extract--Plugin--FormFu \
perl-Locale--Maketext--Extract--Plugin--FormFu--Extractor \
perl-Locale--Maketext--Extract--Plugin--Generic \
perl-Locale--Maketext--Extract--Plugin--Haml \
perl-Locale--Maketext--Extract--Plugin--Mason \
perl-Locale--Maketext--Extract--Plugin--PPI \
perl-Locale--Maketext--Extract--Plugin--Perl \
perl-Locale--Maketext--Extract--Plugin--TT2 \
perl-Locale--Maketext--Extract--Plugin--TT2--Directive \
perl-Locale--Maketext--Extract--Plugin--TT2--Parser \
perl-Locale--Maketext--Extract--Plugin--TextTemplate \
perl-Locale--Maketext--Extract--Plugin--TextTemplate--Parser \
perl-Locale--Maketext--Extract--Plugin--YAML \
perl-Locale--Maketext--Extract--Plugin--YAML--Extractor \
perl-Locale--Maketext--Extract--Run \
perl-Locale--Maketext--Lexicon \
perl-Locale--Maketext--Lexicon--Auto \
perl-Locale--Maketext--Lexicon--Gettext \
perl-Locale--Maketext--Lexicon--Msgcat \
perl-Locale--Maketext--Lexicon--Tie \
perl-Locale-Maketext-Lexicon"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Locale--Maketext"

inherit rpm
