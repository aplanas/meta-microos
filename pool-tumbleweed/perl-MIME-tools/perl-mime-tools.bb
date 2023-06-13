SUMMARY = "Tools to manipulate MIME messages"
DESCRIPTION = "Tools to manipulate MIME messages"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.510"

RPM_NAME = "perl-MIME-tools-5.510-1.3.noarch.rpm"
RPM_HASH = "57ad899a33f6180aeca4ffc3b174837fcaf7bf8755e0a480b3ff5845c5cfb1e1bceb097fa1dcc985883ea16f49cbdd242973beb06b1b667b1dcd2824ce4e5416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MIME::Body) \
perl(MIME::Body::File) \
perl(MIME::Body::InCore) \
perl(MIME::Body::Scalar) \
perl(MIME::Decoder) \
perl(MIME::Decoder::Base64) \
perl(MIME::Decoder::BinHex) \
perl(MIME::Decoder::Binary) \
perl(MIME::Decoder::Gzip64) \
perl(MIME::Decoder::NBit) \
perl(MIME::Decoder::QuotedPrint) \
perl(MIME::Decoder::UU) \
perl(MIME::Entity) \
perl(MIME::Field::ConTraEnc) \
perl(MIME::Field::ContDisp) \
perl(MIME::Field::ContType) \
perl(MIME::Field::ParamVal) \
perl(MIME::Head) \
perl(MIME::Parser) \
perl(MIME::Parser::FileInto) \
perl(MIME::Parser::FileUnder) \
perl(MIME::Parser::Filer) \
perl(MIME::Parser::Reader) \
perl(MIME::Parser::Results) \
perl(MIME::Tools) \
perl(MIME::WordDecoder) \
perl(MIME::WordDecoder::ISO_8859) \
perl(MIME::WordDecoder::US_ASCII) \
perl(MIME::WordDecoder::UTF_8) \
perl(MIME::Words) \
perl-MIME-tools"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(File::Temp) \
perl(Mail::Field) \
perl(Mail::Header) \
perl(Mail::Internet)"

inherit rpm
