SUMMARY = "High-Level Interface to Uniforum Message Translation"
DESCRIPTION = "This is an internationalization library for Perl that aims to be \
compatible with the Uniforum message translations system as implemented \
for example in GNU gettext."
LICENSE = "GPL-3.0-or-later"

PV = "1.33"

RPM_NAME = "perl-libintl-perl-1.33-1.2.aarch64.rpm"
RPM_HASH = "13aa10414260c3c0b6610f62fff1c2d1212c394eb78a61bc6d4eee2a273d9bc264441042422e1d5896277cc11ad86583e17079beaf6b49173ebe8878bc86de6e"

RPROVIDES:${PN} += "perl(Locale::Messages) \
perl(Locale::Recode) \
perl(Locale::Recode::_Aliases) \
perl(Locale::Recode::_Conversions) \
perl(Locale::RecodeData) \
perl(Locale::RecodeData::ASMO_449) \
perl(Locale::RecodeData::ATARI_ST) \
perl(Locale::RecodeData::ATARI_ST_EURO) \
perl(Locale::RecodeData::CP10007) \
perl(Locale::RecodeData::CP1250) \
perl(Locale::RecodeData::CP1251) \
perl(Locale::RecodeData::CP1252) \
perl(Locale::RecodeData::CP1253) \
perl(Locale::RecodeData::CP1254) \
perl(Locale::RecodeData::CP1256) \
perl(Locale::RecodeData::CP1257) \
perl(Locale::RecodeData::CSN_369103) \
perl(Locale::RecodeData::CWI) \
perl(Locale::RecodeData::DEC_MCS) \
perl(Locale::RecodeData::EBCDIC_AT_DE) \
perl(Locale::RecodeData::EBCDIC_AT_DE_A) \
perl(Locale::RecodeData::EBCDIC_CA_FR) \
perl(Locale::RecodeData::EBCDIC_DK_NO) \
perl(Locale::RecodeData::EBCDIC_DK_NO_A) \
perl(Locale::RecodeData::EBCDIC_ES) \
perl(Locale::RecodeData::EBCDIC_ES_A) \
perl(Locale::RecodeData::EBCDIC_ES_S) \
perl(Locale::RecodeData::EBCDIC_FI_SE) \
perl(Locale::RecodeData::EBCDIC_FI_SE_A) \
perl(Locale::RecodeData::EBCDIC_FR) \
perl(Locale::RecodeData::EBCDIC_IS_FRISS) \
perl(Locale::RecodeData::EBCDIC_IT) \
perl(Locale::RecodeData::EBCDIC_PT) \
perl(Locale::RecodeData::EBCDIC_UK) \
perl(Locale::RecodeData::EBCDIC_US) \
perl(Locale::RecodeData::ECMA_CYRILLIC) \
perl(Locale::RecodeData::GEORGIAN_ACADEMY) \
perl(Locale::RecodeData::GEORGIAN_PS) \
perl(Locale::RecodeData::GOST_19768_74) \
perl(Locale::RecodeData::GREEK7) \
perl(Locale::RecodeData::GREEK7_OLD) \
perl(Locale::RecodeData::GREEK_CCITT) \
perl(Locale::RecodeData::HP_ROMAN8) \
perl(Locale::RecodeData::IBM037) \
perl(Locale::RecodeData::IBM038) \
perl(Locale::RecodeData::IBM1004) \
perl(Locale::RecodeData::IBM1026) \
perl(Locale::RecodeData::IBM1047) \
perl(Locale::RecodeData::IBM256) \
perl(Locale::RecodeData::IBM273) \
perl(Locale::RecodeData::IBM274) \
perl(Locale::RecodeData::IBM275) \
perl(Locale::RecodeData::IBM277) \
perl(Locale::RecodeData::IBM278) \
perl(Locale::RecodeData::IBM280) \
perl(Locale::RecodeData::IBM281) \
perl(Locale::RecodeData::IBM284) \
perl(Locale::RecodeData::IBM285) \
perl(Locale::RecodeData::IBM290) \
perl(Locale::RecodeData::IBM297) \
perl(Locale::RecodeData::IBM420) \
perl(Locale::RecodeData::IBM423) \
perl(Locale::RecodeData::IBM424) \
perl(Locale::RecodeData::IBM437) \
perl(Locale::RecodeData::IBM500) \
perl(Locale::RecodeData::IBM850) \
perl(Locale::RecodeData::IBM851) \
perl(Locale::RecodeData::IBM852) \
perl(Locale::RecodeData::IBM855) \
perl(Locale::RecodeData::IBM857) \
perl(Locale::RecodeData::IBM860) \
perl(Locale::RecodeData::IBM861) \
perl(Locale::RecodeData::IBM862) \
perl(Locale::RecodeData::IBM863) \
perl(Locale::RecodeData::IBM864) \
perl(Locale::RecodeData::IBM865) \
perl(Locale::RecodeData::IBM866) \
perl(Locale::RecodeData::IBM868) \
perl(Locale::RecodeData::IBM869) \
perl(Locale::RecodeData::IBM870) \
perl(Locale::RecodeData::IBM871) \
perl(Locale::RecodeData::IBM874) \
perl(Locale::RecodeData::IBM875) \
perl(Locale::RecodeData::IBM880) \
perl(Locale::RecodeData::IBM891) \
perl(Locale::RecodeData::IBM903) \
perl(Locale::RecodeData::IBM904) \
perl(Locale::RecodeData::IBM905) \
perl(Locale::RecodeData::IBM918) \
perl(Locale::RecodeData::IEC_P27_1) \
perl(Locale::RecodeData::INIS) \
perl(Locale::RecodeData::INIS_8) \
perl(Locale::RecodeData::INIS_CYRILLIC) \
perl(Locale::RecodeData::ISO_10367_BOX) \
perl(Locale::RecodeData::ISO_2033_1983) \
perl(Locale::RecodeData::ISO_5427) \
perl(Locale::RecodeData::ISO_5427_EXT) \
perl(Locale::RecodeData::ISO_5428) \
perl(Locale::RecodeData::ISO_8859_1) \
perl(Locale::RecodeData::ISO_8859_10) \
perl(Locale::RecodeData::ISO_8859_11) \
perl(Locale::RecodeData::ISO_8859_13) \
perl(Locale::RecodeData::ISO_8859_14) \
perl(Locale::RecodeData::ISO_8859_15) \
perl(Locale::RecodeData::ISO_8859_16) \
perl(Locale::RecodeData::ISO_8859_2) \
perl(Locale::RecodeData::ISO_8859_3) \
perl(Locale::RecodeData::ISO_8859_4) \
perl(Locale::RecodeData::ISO_8859_5) \
perl(Locale::RecodeData::ISO_8859_6) \
perl(Locale::RecodeData::ISO_8859_7) \
perl(Locale::RecodeData::ISO_8859_8) \
perl(Locale::RecodeData::ISO_8859_9) \
perl(Locale::RecodeData::KOI8_R) \
perl(Locale::RecodeData::KOI8_RU) \
perl(Locale::RecodeData::KOI8_T) \
perl(Locale::RecodeData::KOI8_U) \
perl(Locale::RecodeData::KOI_8) \
perl(Locale::RecodeData::LATIN_GREEK) \
perl(Locale::RecodeData::LATIN_GREEK_1) \
perl(Locale::RecodeData::MACARABIC) \
perl(Locale::RecodeData::MACCROATIAN) \
perl(Locale::RecodeData::MACCYRILLIC) \
perl(Locale::RecodeData::MACGREEK) \
perl(Locale::RecodeData::MACHEBREW) \
perl(Locale::RecodeData::MACICELAND) \
perl(Locale::RecodeData::MACINTOSH) \
perl(Locale::RecodeData::MACROMANIA) \
perl(Locale::RecodeData::MACTHAI) \
perl(Locale::RecodeData::MACTURKISH) \
perl(Locale::RecodeData::MACUKRAINE) \
perl(Locale::RecodeData::MAC_IS) \
perl(Locale::RecodeData::MAC_SAMI) \
perl(Locale::RecodeData::MAC_UK) \
perl(Locale::RecodeData::NATS_DANO) \
perl(Locale::RecodeData::NATS_SEFI) \
perl(Locale::RecodeData::NEXTSTEP) \
perl(Locale::RecodeData::SAMI_WS2) \
perl(Locale::RecodeData::TIS_620) \
perl(Locale::RecodeData::US_ASCII) \
perl(Locale::RecodeData::UTF_8) \
perl(Locale::RecodeData::VISCII) \
perl(Locale::RecodeData::_Encode) \
perl(Locale::TextDomain) \
perl(Locale::Util) \
perl(Locale::gettext_dumb) \
perl(Locale::gettext_pp) \
perl(Locale::gettext_xs) \
perl(__TiedTextDomain) \
perl-libintl-perl \
perl-libintl-perl(aarch-64)"

RDEPENDS:${PN} += "gettext-runtime \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(version)"

inherit rpm
