SUMMARY = "High-Level Interface to Uniforum Message Translation"
DESCRIPTION = "This is an internationalization library for Perl that aims to be \
compatible with the Uniforum message translations system as implemented \
for example in GNU gettext."
LICENSE = "GPL-3.0-or-later"

PV = "1.33"

RPM_NAME = "perl-libintl-perl-1.33-1.4.aarch64.rpm"
RPM_HASH = "9999aa3bd2844943511aa2329a9ae80e00a2faeeaa3def78edf32f403cbcda00c8fa38a8ddb32ed4475f86279c76c58b672b4373d8aa19537dde96cd99869169"

RPROVIDES:${PN} += "perl---TiedTextDomain \
perl-Locale--Messages \
perl-Locale--Recode \
perl-Locale--Recode---Aliases \
perl-Locale--Recode---Conversions \
perl-Locale--RecodeData \
perl-Locale--RecodeData---Encode \
perl-Locale--RecodeData--ASMO-449 \
perl-Locale--RecodeData--ATARI-ST \
perl-Locale--RecodeData--ATARI-ST-EURO \
perl-Locale--RecodeData--CP10007 \
perl-Locale--RecodeData--CP1250 \
perl-Locale--RecodeData--CP1251 \
perl-Locale--RecodeData--CP1252 \
perl-Locale--RecodeData--CP1253 \
perl-Locale--RecodeData--CP1254 \
perl-Locale--RecodeData--CP1256 \
perl-Locale--RecodeData--CP1257 \
perl-Locale--RecodeData--CSN-369103 \
perl-Locale--RecodeData--CWI \
perl-Locale--RecodeData--DEC-MCS \
perl-Locale--RecodeData--EBCDIC-AT-DE \
perl-Locale--RecodeData--EBCDIC-AT-DE-A \
perl-Locale--RecodeData--EBCDIC-CA-FR \
perl-Locale--RecodeData--EBCDIC-DK-NO \
perl-Locale--RecodeData--EBCDIC-DK-NO-A \
perl-Locale--RecodeData--EBCDIC-ES \
perl-Locale--RecodeData--EBCDIC-ES-A \
perl-Locale--RecodeData--EBCDIC-ES-S \
perl-Locale--RecodeData--EBCDIC-FI-SE \
perl-Locale--RecodeData--EBCDIC-FI-SE-A \
perl-Locale--RecodeData--EBCDIC-FR \
perl-Locale--RecodeData--EBCDIC-IS-FRISS \
perl-Locale--RecodeData--EBCDIC-IT \
perl-Locale--RecodeData--EBCDIC-PT \
perl-Locale--RecodeData--EBCDIC-UK \
perl-Locale--RecodeData--EBCDIC-US \
perl-Locale--RecodeData--ECMA-CYRILLIC \
perl-Locale--RecodeData--GEORGIAN-ACADEMY \
perl-Locale--RecodeData--GEORGIAN-PS \
perl-Locale--RecodeData--GOST-19768-74 \
perl-Locale--RecodeData--GREEK-CCITT \
perl-Locale--RecodeData--GREEK7 \
perl-Locale--RecodeData--GREEK7-OLD \
perl-Locale--RecodeData--HP-ROMAN8 \
perl-Locale--RecodeData--IBM037 \
perl-Locale--RecodeData--IBM038 \
perl-Locale--RecodeData--IBM1004 \
perl-Locale--RecodeData--IBM1026 \
perl-Locale--RecodeData--IBM1047 \
perl-Locale--RecodeData--IBM256 \
perl-Locale--RecodeData--IBM273 \
perl-Locale--RecodeData--IBM274 \
perl-Locale--RecodeData--IBM275 \
perl-Locale--RecodeData--IBM277 \
perl-Locale--RecodeData--IBM278 \
perl-Locale--RecodeData--IBM280 \
perl-Locale--RecodeData--IBM281 \
perl-Locale--RecodeData--IBM284 \
perl-Locale--RecodeData--IBM285 \
perl-Locale--RecodeData--IBM290 \
perl-Locale--RecodeData--IBM297 \
perl-Locale--RecodeData--IBM420 \
perl-Locale--RecodeData--IBM423 \
perl-Locale--RecodeData--IBM424 \
perl-Locale--RecodeData--IBM437 \
perl-Locale--RecodeData--IBM500 \
perl-Locale--RecodeData--IBM850 \
perl-Locale--RecodeData--IBM851 \
perl-Locale--RecodeData--IBM852 \
perl-Locale--RecodeData--IBM855 \
perl-Locale--RecodeData--IBM857 \
perl-Locale--RecodeData--IBM860 \
perl-Locale--RecodeData--IBM861 \
perl-Locale--RecodeData--IBM862 \
perl-Locale--RecodeData--IBM863 \
perl-Locale--RecodeData--IBM864 \
perl-Locale--RecodeData--IBM865 \
perl-Locale--RecodeData--IBM866 \
perl-Locale--RecodeData--IBM868 \
perl-Locale--RecodeData--IBM869 \
perl-Locale--RecodeData--IBM870 \
perl-Locale--RecodeData--IBM871 \
perl-Locale--RecodeData--IBM874 \
perl-Locale--RecodeData--IBM875 \
perl-Locale--RecodeData--IBM880 \
perl-Locale--RecodeData--IBM891 \
perl-Locale--RecodeData--IBM903 \
perl-Locale--RecodeData--IBM904 \
perl-Locale--RecodeData--IBM905 \
perl-Locale--RecodeData--IBM918 \
perl-Locale--RecodeData--IEC-P27-1 \
perl-Locale--RecodeData--INIS \
perl-Locale--RecodeData--INIS-8 \
perl-Locale--RecodeData--INIS-CYRILLIC \
perl-Locale--RecodeData--ISO-10367-BOX \
perl-Locale--RecodeData--ISO-2033-1983 \
perl-Locale--RecodeData--ISO-5427 \
perl-Locale--RecodeData--ISO-5427-EXT \
perl-Locale--RecodeData--ISO-5428 \
perl-Locale--RecodeData--ISO-8859-1 \
perl-Locale--RecodeData--ISO-8859-10 \
perl-Locale--RecodeData--ISO-8859-11 \
perl-Locale--RecodeData--ISO-8859-13 \
perl-Locale--RecodeData--ISO-8859-14 \
perl-Locale--RecodeData--ISO-8859-15 \
perl-Locale--RecodeData--ISO-8859-16 \
perl-Locale--RecodeData--ISO-8859-2 \
perl-Locale--RecodeData--ISO-8859-3 \
perl-Locale--RecodeData--ISO-8859-4 \
perl-Locale--RecodeData--ISO-8859-5 \
perl-Locale--RecodeData--ISO-8859-6 \
perl-Locale--RecodeData--ISO-8859-7 \
perl-Locale--RecodeData--ISO-8859-8 \
perl-Locale--RecodeData--ISO-8859-9 \
perl-Locale--RecodeData--KOI-8 \
perl-Locale--RecodeData--KOI8-R \
perl-Locale--RecodeData--KOI8-RU \
perl-Locale--RecodeData--KOI8-T \
perl-Locale--RecodeData--KOI8-U \
perl-Locale--RecodeData--LATIN-GREEK \
perl-Locale--RecodeData--LATIN-GREEK-1 \
perl-Locale--RecodeData--MAC-IS \
perl-Locale--RecodeData--MAC-SAMI \
perl-Locale--RecodeData--MAC-UK \
perl-Locale--RecodeData--MACARABIC \
perl-Locale--RecodeData--MACCROATIAN \
perl-Locale--RecodeData--MACCYRILLIC \
perl-Locale--RecodeData--MACGREEK \
perl-Locale--RecodeData--MACHEBREW \
perl-Locale--RecodeData--MACICELAND \
perl-Locale--RecodeData--MACINTOSH \
perl-Locale--RecodeData--MACROMANIA \
perl-Locale--RecodeData--MACTHAI \
perl-Locale--RecodeData--MACTURKISH \
perl-Locale--RecodeData--MACUKRAINE \
perl-Locale--RecodeData--NATS-DANO \
perl-Locale--RecodeData--NATS-SEFI \
perl-Locale--RecodeData--NEXTSTEP \
perl-Locale--RecodeData--SAMI-WS2 \
perl-Locale--RecodeData--TIS-620 \
perl-Locale--RecodeData--US-ASCII \
perl-Locale--RecodeData--UTF-8 \
perl-Locale--RecodeData--VISCII \
perl-Locale--TextDomain \
perl-Locale--Util \
perl-Locale--gettext-dumb \
perl-Locale--gettext-pp \
perl-Locale--gettext-xs \
perl-libintl-perl"

RDEPENDS:${PN} += "gettext-runtime \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-version"

inherit rpm
