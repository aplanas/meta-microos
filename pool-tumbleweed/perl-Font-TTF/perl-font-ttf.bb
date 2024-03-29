SUMMARY = "Perl module for TrueType Font hacking"
DESCRIPTION = "This module allows you to do almost anything to a TrueType/OpenType Font \
including modify and inspect nearly all tables."
LICENSE = "Artistic-2.0 & OFL-1.1"

PV = "1.06"

RPM_NAME = "perl-Font-TTF-1.06-1.25.noarch.rpm"
RPM_HASH = "04626ca7e0e7b22d413f3f282cff1d175b1be89073cbcb562a67664e2456665aea6bdec16a6a4c88fc58784bad751bafa348bda437065f2b918b74445ff162ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Font--TTF \
perl-Font--TTF--AATKern \
perl-Font--TTF--AATutils \
perl-Font--TTF--Anchor \
perl-Font--TTF--Bsln \
perl-Font--TTF--Cmap \
perl-Font--TTF--Coverage \
perl-Font--TTF--Cvt- \
perl-Font--TTF--DSIG \
perl-Font--TTF--Delta \
perl-Font--TTF--Dumper \
perl-Font--TTF--EBDT \
perl-Font--TTF--EBLC \
perl-Font--TTF--Fdsc \
perl-Font--TTF--Feat \
perl-Font--TTF--Features--Cvar \
perl-Font--TTF--Features--Size \
perl-Font--TTF--Features--Sset \
perl-Font--TTF--Fmtx \
perl-Font--TTF--Font \
perl-Font--TTF--Fpgm \
perl-Font--TTF--GDEF \
perl-Font--TTF--GPOS \
perl-Font--TTF--GSUB \
perl-Font--TTF--Glat \
perl-Font--TTF--Gloc \
perl-Font--TTF--Glyf \
perl-Font--TTF--Glyph \
perl-Font--TTF--GrFeat \
perl-Font--TTF--Hdmx \
perl-Font--TTF--Head \
perl-Font--TTF--Hhea \
perl-Font--TTF--Hmtx \
perl-Font--TTF--Kern \
perl-Font--TTF--Kern--ClassArray \
perl-Font--TTF--Kern--CompactClassArray \
perl-Font--TTF--Kern--OrderedList \
perl-Font--TTF--Kern--StateTable \
perl-Font--TTF--Kern--Subtable \
perl-Font--TTF--LTSH \
perl-Font--TTF--Loca \
perl-Font--TTF--Maxp \
perl-Font--TTF--Mort \
perl-Font--TTF--Mort--Chain \
perl-Font--TTF--Mort--Contextual \
perl-Font--TTF--Mort--Insertion \
perl-Font--TTF--Mort--Ligature \
perl-Font--TTF--Mort--Noncontextual \
perl-Font--TTF--Mort--Rearrangement \
perl-Font--TTF--Mort--Subtable \
perl-Font--TTF--Name \
perl-Font--TTF--OS-2 \
perl-Font--TTF--OTTags \
perl-Font--TTF--OldCmap \
perl-Font--TTF--OldMort \
perl-Font--TTF--PCLT \
perl-Font--TTF--PSNames \
perl-Font--TTF--Post \
perl-Font--TTF--Prep \
perl-Font--TTF--Prop \
perl-Font--TTF--Segarr \
perl-Font--TTF--Silf \
perl-Font--TTF--Sill \
perl-Font--TTF--Table \
perl-Font--TTF--Ttc \
perl-Font--TTF--Ttopen \
perl-Font--TTF--Utils \
perl-Font--TTF--Vhea \
perl-Font--TTF--Vmtx \
perl-Font--TTF--Win32 \
perl-Font--TTF--Woff \
perl-Font--TTF--Woff--MetaData \
perl-Font--TTF--Woff--PrivateData \
perl-Font--TTF--XMLparse \
perl-Font-TTF"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO--String"

inherit rpm
