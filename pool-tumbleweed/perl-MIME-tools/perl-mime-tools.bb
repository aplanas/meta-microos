SUMMARY = "Tools to manipulate MIME messages"
DESCRIPTION = "Tools to manipulate MIME messages"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.510"

RPM_NAME = "perl-MIME-tools-5.510-1.5.noarch.rpm"
RPM_HASH = "fd40ab65e5e8e4efced2c30e600b12f5a6987d796d2ac13440186ed4673e444cc0be68b1fb93005a530aa9b4f23525c6d28b214e75aed272f79d31f5893a2653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MIME--Body \
perl-MIME--Body--File \
perl-MIME--Body--InCore \
perl-MIME--Body--Scalar \
perl-MIME--Decoder \
perl-MIME--Decoder--Base64 \
perl-MIME--Decoder--BinHex \
perl-MIME--Decoder--Binary \
perl-MIME--Decoder--Gzip64 \
perl-MIME--Decoder--NBit \
perl-MIME--Decoder--QuotedPrint \
perl-MIME--Decoder--UU \
perl-MIME--Entity \
perl-MIME--Field--ConTraEnc \
perl-MIME--Field--ContDisp \
perl-MIME--Field--ContType \
perl-MIME--Field--ParamVal \
perl-MIME--Head \
perl-MIME--Parser \
perl-MIME--Parser--FileInto \
perl-MIME--Parser--FileUnder \
perl-MIME--Parser--Filer \
perl-MIME--Parser--Reader \
perl-MIME--Parser--Results \
perl-MIME--Tools \
perl-MIME--WordDecoder \
perl-MIME--WordDecoder--ISO-8859 \
perl-MIME--WordDecoder--US-ASCII \
perl-MIME--WordDecoder--UTF-8 \
perl-MIME--Words \
perl-MIME-tools"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--Temp \
perl-Mail--Field \
perl-Mail--Header \
perl-Mail--Internet"

inherit rpm
