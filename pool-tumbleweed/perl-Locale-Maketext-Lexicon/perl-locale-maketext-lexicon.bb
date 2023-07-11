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

RPM_NAME = "perl-Locale-Maketext-Lexicon-1.00-1.27.noarch.rpm"
RPM_HASH = "52087e4373acddf2cbb82b5df946ead434cf03a09c93ad6f903fe20153df76acf3c103333e9c04ff43f2ebc29fec789c5a7ff6fc039f8b591fc6582b48ffc6ef"
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
perl--MODULE-COMPAT-5.36.1 \
perl-Locale--Maketext"

inherit rpm
