SUMMARY = "Create, modify, and examine PDF files"
DESCRIPTION = "Create, modify, and examine PDF files"
LICENSE = "LGPL-2.1-or-later"

PV = "2.044"

RPM_NAME = "perl-PDF-API2-2.044-1.2.noarch.rpm"
RPM_HASH = "eed1521c401f04d3ce80ebf2d7a8e9efb2c15150d24114a79bf12cd9faad6e4f8b94d3d44d27f87305cfbacc9293b691099bcaf6815183e3250ba2a9e3a72c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(PDF::API2) \
perl(PDF::API2::Annotation) \
perl(PDF::API2::Basic::PDF::Array) \
perl(PDF::API2::Basic::PDF::Bool) \
perl(PDF::API2::Basic::PDF::Dict) \
perl(PDF::API2::Basic::PDF::File) \
perl(PDF::API2::Basic::PDF::Filter) \
perl(PDF::API2::Basic::PDF::Filter::ASCII85Decode) \
perl(PDF::API2::Basic::PDF::Filter::ASCIIHexDecode) \
perl(PDF::API2::Basic::PDF::Filter::FlateDecode) \
perl(PDF::API2::Basic::PDF::Filter::LZWDecode) \
perl(PDF::API2::Basic::PDF::Filter::RunLengthDecode) \
perl(PDF::API2::Basic::PDF::Literal) \
perl(PDF::API2::Basic::PDF::Name) \
perl(PDF::API2::Basic::PDF::Null) \
perl(PDF::API2::Basic::PDF::Number) \
perl(PDF::API2::Basic::PDF::Objind) \
perl(PDF::API2::Basic::PDF::Page) \
perl(PDF::API2::Basic::PDF::Pages) \
perl(PDF::API2::Basic::PDF::String) \
perl(PDF::API2::Basic::PDF::Utils) \
perl(PDF::API2::Content) \
perl(PDF::API2::Content::Text) \
perl(PDF::API2::Lite) \
perl(PDF::API2::Matrix) \
perl(PDF::API2::NamedDestination) \
perl(PDF::API2::Outline) \
perl(PDF::API2::Outlines) \
perl(PDF::API2::Page) \
perl(PDF::API2::Resource) \
perl(PDF::API2::Resource::BaseFont) \
perl(PDF::API2::Resource::CIDFont) \
perl(PDF::API2::Resource::CIDFont::CJKFont) \
perl(PDF::API2::Resource::CIDFont::TrueType) \
perl(PDF::API2::Resource::CIDFont::TrueType::FontFile) \
perl(PDF::API2::Resource::ColorSpace) \
perl(PDF::API2::Resource::ColorSpace::DeviceN) \
perl(PDF::API2::Resource::ColorSpace::Indexed) \
perl(PDF::API2::Resource::ColorSpace::Indexed::ACTFile) \
perl(PDF::API2::Resource::ColorSpace::Indexed::Hue) \
perl(PDF::API2::Resource::ColorSpace::Indexed::WebColor) \
perl(PDF::API2::Resource::ColorSpace::Separation) \
perl(PDF::API2::Resource::Colors) \
perl(PDF::API2::Resource::ExtGState) \
perl(PDF::API2::Resource::Font) \
perl(PDF::API2::Resource::Font::BdFont) \
perl(PDF::API2::Resource::Font::CoreFont) \
perl(PDF::API2::Resource::Font::CoreFont::bankgothic) \
perl(PDF::API2::Resource::Font::CoreFont::courier) \
perl(PDF::API2::Resource::Font::CoreFont::courierbold) \
perl(PDF::API2::Resource::Font::CoreFont::courierboldoblique) \
perl(PDF::API2::Resource::Font::CoreFont::courieroblique) \
perl(PDF::API2::Resource::Font::CoreFont::georgia) \
perl(PDF::API2::Resource::Font::CoreFont::georgiabold) \
perl(PDF::API2::Resource::Font::CoreFont::georgiabolditalic) \
perl(PDF::API2::Resource::Font::CoreFont::georgiaitalic) \
perl(PDF::API2::Resource::Font::CoreFont::helvetica) \
perl(PDF::API2::Resource::Font::CoreFont::helveticabold) \
perl(PDF::API2::Resource::Font::CoreFont::helveticaboldoblique) \
perl(PDF::API2::Resource::Font::CoreFont::helveticaoblique) \
perl(PDF::API2::Resource::Font::CoreFont::symbol) \
perl(PDF::API2::Resource::Font::CoreFont::timesbold) \
perl(PDF::API2::Resource::Font::CoreFont::timesbolditalic) \
perl(PDF::API2::Resource::Font::CoreFont::timesitalic) \
perl(PDF::API2::Resource::Font::CoreFont::timesroman) \
perl(PDF::API2::Resource::Font::CoreFont::trebuchet) \
perl(PDF::API2::Resource::Font::CoreFont::trebuchetbold) \
perl(PDF::API2::Resource::Font::CoreFont::trebuchetbolditalic) \
perl(PDF::API2::Resource::Font::CoreFont::trebuchetitalic) \
perl(PDF::API2::Resource::Font::CoreFont::verdana) \
perl(PDF::API2::Resource::Font::CoreFont::verdanabold) \
perl(PDF::API2::Resource::Font::CoreFont::verdanabolditalic) \
perl(PDF::API2::Resource::Font::CoreFont::verdanaitalic) \
perl(PDF::API2::Resource::Font::CoreFont::webdings) \
perl(PDF::API2::Resource::Font::CoreFont::wingdings) \
perl(PDF::API2::Resource::Font::CoreFont::zapfdingbats) \
perl(PDF::API2::Resource::Font::Postscript) \
perl(PDF::API2::Resource::Font::SynFont) \
perl(PDF::API2::Resource::Glyphs) \
perl(PDF::API2::Resource::PaperSizes) \
perl(PDF::API2::Resource::Pattern) \
perl(PDF::API2::Resource::Shading) \
perl(PDF::API2::Resource::UniFont) \
perl(PDF::API2::Resource::XObject) \
perl(PDF::API2::Resource::XObject::Form) \
perl(PDF::API2::Resource::XObject::Form::BarCode) \
perl(PDF::API2::Resource::XObject::Form::BarCode::codabar) \
perl(PDF::API2::Resource::XObject::Form::BarCode::code128) \
perl(PDF::API2::Resource::XObject::Form::BarCode::code3of9) \
perl(PDF::API2::Resource::XObject::Form::BarCode::ean13) \
perl(PDF::API2::Resource::XObject::Form::BarCode::int2of5) \
perl(PDF::API2::Resource::XObject::Form::BarCode::qrcode) \
perl(PDF::API2::Resource::XObject::Form::Hybrid) \
perl(PDF::API2::Resource::XObject::Image) \
perl(PDF::API2::Resource::XObject::Image::GD) \
perl(PDF::API2::Resource::XObject::Image::GIF) \
perl(PDF::API2::Resource::XObject::Image::JPEG) \
perl(PDF::API2::Resource::XObject::Image::PNG) \
perl(PDF::API2::Resource::XObject::Image::PNM) \
perl(PDF::API2::Resource::XObject::Image::TIFF) \
perl(PDF::API2::Resource::XObject::Image::TIFF::File) \
perl(PDF::API2::UniWrap) \
perl(PDF::API2::Util) \
perl(PDF::API2::ViewerPreferences) \
perl(PDF::API2::Win32) \
perl-PDF-API2"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Compress::Zlib) \
perl(Font::TTF)"

inherit rpm
