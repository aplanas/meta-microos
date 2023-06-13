SUMMARY = "Facilitates the creation and modification of PDF files"
DESCRIPTION = "Facilitates the creation and modification of PDF files"
LICENSE = "LGPL-2.1-or-later"

PV = "3.025"

RPM_NAME = "perl-PDF-Builder-3.025-1.1.noarch.rpm"
RPM_HASH = "8b47f3ae737bb5dadcf5a6ef19a99130ce01e8411f99b45d07ad30e0c534887bdad4cf5eb6fbf464b1de99f3d15154562daa840308e54b1510f62ca5522dfbb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(PDF::Builder) \
perl(PDF::Builder::Annotation) \
perl(PDF::Builder::Basic::PDF) \
perl(PDF::Builder::Basic::PDF::Array) \
perl(PDF::Builder::Basic::PDF::Bool) \
perl(PDF::Builder::Basic::PDF::Dict) \
perl(PDF::Builder::Basic::PDF::File) \
perl(PDF::Builder::Basic::PDF::Filter) \
perl(PDF::Builder::Basic::PDF::Filter::ASCII85Decode) \
perl(PDF::Builder::Basic::PDF::Filter::ASCIIHexDecode) \
perl(PDF::Builder::Basic::PDF::Filter::FlateDecode) \
perl(PDF::Builder::Basic::PDF::Filter::LZWDecode) \
perl(PDF::Builder::Basic::PDF::Filter::RunLengthDecode) \
perl(PDF::Builder::Basic::PDF::Literal) \
perl(PDF::Builder::Basic::PDF::Name) \
perl(PDF::Builder::Basic::PDF::Null) \
perl(PDF::Builder::Basic::PDF::Number) \
perl(PDF::Builder::Basic::PDF::Objind) \
perl(PDF::Builder::Basic::PDF::Page) \
perl(PDF::Builder::Basic::PDF::Pages) \
perl(PDF::Builder::Basic::PDF::String) \
perl(PDF::Builder::Basic::PDF::Utils) \
perl(PDF::Builder::Content) \
perl(PDF::Builder::Content::Hyphenate_basic) \
perl(PDF::Builder::Content::Text) \
perl(PDF::Builder::Docs) \
perl(PDF::Builder::FontManager) \
perl(PDF::Builder::Lite) \
perl(PDF::Builder::Matrix) \
perl(PDF::Builder::NamedDestination) \
perl(PDF::Builder::Outline) \
perl(PDF::Builder::Outlines) \
perl(PDF::Builder::Page) \
perl(PDF::Builder::Resource) \
perl(PDF::Builder::Resource::BaseFont) \
perl(PDF::Builder::Resource::CIDFont) \
perl(PDF::Builder::Resource::CIDFont::CJKFont) \
perl(PDF::Builder::Resource::CIDFont::TrueType) \
perl(PDF::Builder::Resource::CIDFont::TrueType::FontFile) \
perl(PDF::Builder::Resource::ColorSpace) \
perl(PDF::Builder::Resource::ColorSpace::DeviceN) \
perl(PDF::Builder::Resource::ColorSpace::Indexed) \
perl(PDF::Builder::Resource::ColorSpace::Indexed::ACTFile) \
perl(PDF::Builder::Resource::ColorSpace::Indexed::Hue) \
perl(PDF::Builder::Resource::ColorSpace::Indexed::WebColor) \
perl(PDF::Builder::Resource::ColorSpace::Separation) \
perl(PDF::Builder::Resource::Colors) \
perl(PDF::Builder::Resource::ExtGState) \
perl(PDF::Builder::Resource::Font) \
perl(PDF::Builder::Resource::Font::BdFont) \
perl(PDF::Builder::Resource::Font::CoreFont) \
perl(PDF::Builder::Resource::Font::CoreFont::bankgothic) \
perl(PDF::Builder::Resource::Font::CoreFont::courier) \
perl(PDF::Builder::Resource::Font::CoreFont::courierbold) \
perl(PDF::Builder::Resource::Font::CoreFont::courierboldoblique) \
perl(PDF::Builder::Resource::Font::CoreFont::courieroblique) \
perl(PDF::Builder::Resource::Font::CoreFont::georgia) \
perl(PDF::Builder::Resource::Font::CoreFont::georgiabold) \
perl(PDF::Builder::Resource::Font::CoreFont::georgiabolditalic) \
perl(PDF::Builder::Resource::Font::CoreFont::georgiaitalic) \
perl(PDF::Builder::Resource::Font::CoreFont::helvetica) \
perl(PDF::Builder::Resource::Font::CoreFont::helveticabold) \
perl(PDF::Builder::Resource::Font::CoreFont::helveticaboldoblique) \
perl(PDF::Builder::Resource::Font::CoreFont::helveticaoblique) \
perl(PDF::Builder::Resource::Font::CoreFont::symbol) \
perl(PDF::Builder::Resource::Font::CoreFont::timesbold) \
perl(PDF::Builder::Resource::Font::CoreFont::timesbolditalic) \
perl(PDF::Builder::Resource::Font::CoreFont::timesitalic) \
perl(PDF::Builder::Resource::Font::CoreFont::timesroman) \
perl(PDF::Builder::Resource::Font::CoreFont::trebuchet) \
perl(PDF::Builder::Resource::Font::CoreFont::trebuchetbold) \
perl(PDF::Builder::Resource::Font::CoreFont::trebuchetbolditalic) \
perl(PDF::Builder::Resource::Font::CoreFont::trebuchetitalic) \
perl(PDF::Builder::Resource::Font::CoreFont::verdana) \
perl(PDF::Builder::Resource::Font::CoreFont::verdanabold) \
perl(PDF::Builder::Resource::Font::CoreFont::verdanabolditalic) \
perl(PDF::Builder::Resource::Font::CoreFont::verdanaitalic) \
perl(PDF::Builder::Resource::Font::CoreFont::webdings) \
perl(PDF::Builder::Resource::Font::CoreFont::wingdings) \
perl(PDF::Builder::Resource::Font::CoreFont::zapfdingbats) \
perl(PDF::Builder::Resource::Font::Postscript) \
perl(PDF::Builder::Resource::Font::SynFont) \
perl(PDF::Builder::Resource::Glyphs) \
perl(PDF::Builder::Resource::PaperSizes) \
perl(PDF::Builder::Resource::Pattern) \
perl(PDF::Builder::Resource::Shading) \
perl(PDF::Builder::Resource::UniFont) \
perl(PDF::Builder::Resource::XObject) \
perl(PDF::Builder::Resource::XObject::Form) \
perl(PDF::Builder::Resource::XObject::Form::BarCode) \
perl(PDF::Builder::Resource::XObject::Form::BarCode::codabar) \
perl(PDF::Builder::Resource::XObject::Form::BarCode::code128) \
perl(PDF::Builder::Resource::XObject::Form::BarCode::code3of9) \
perl(PDF::Builder::Resource::XObject::Form::BarCode::ean13) \
perl(PDF::Builder::Resource::XObject::Form::BarCode::int2of5) \
perl(PDF::Builder::Resource::XObject::Form::Hybrid) \
perl(PDF::Builder::Resource::XObject::Image) \
perl(PDF::Builder::Resource::XObject::Image::GD) \
perl(PDF::Builder::Resource::XObject::Image::GIF) \
perl(PDF::Builder::Resource::XObject::Image::JPEG) \
perl(PDF::Builder::Resource::XObject::Image::PNG) \
perl(PDF::Builder::Resource::XObject::Image::PNG_IPL) \
perl(PDF::Builder::Resource::XObject::Image::PNM) \
perl(PDF::Builder::Resource::XObject::Image::TIFF) \
perl(PDF::Builder::Resource::XObject::Image::TIFF::File) \
perl(PDF::Builder::Resource::XObject::Image::TIFF::File_GT) \
perl(PDF::Builder::Resource::XObject::Image::TIFF_GT) \
perl(PDF::Builder::UniWrap) \
perl(PDF::Builder::Util) \
perl(PDF::Builder::ViewerPreferences) \
perl-PDF-Builder"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Compress::Zlib) \
perl(Font::TTF)"

inherit rpm
