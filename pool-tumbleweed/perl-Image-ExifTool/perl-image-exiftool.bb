SUMMARY = "Read and write meta information"
DESCRIPTION = "Reads and writes meta information in a wide variety of files, including the \
maker notes of many digital cameras by various manufacturers such as Canon, \
Casio, DJI, FLIR, FujiFilm, GE, GoPro, HP, JVC/Victor, Kodak, Leaf, \
Minolta/Konica-Minolta, Nikon, Nintendo, Olympus/Epson, Panasonic/Leica, \
Pentax/Asahi, Phase One, Reconyx, Ricoh, Samsung, Sanyo, Sigma/Foveon and \
Sony."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "12.62"

RPM_NAME = "perl-Image-ExifTool-12.62-1.1.noarch.rpm"
RPM_HASH = "b522a395eacdc22f33038f7f983477a1fd2a61a43626d14f4e4bf246d7f7b26be36ebce938f38f759b12c709b7873621e0dcc88f30fce247ad08c77b4a0f97a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Image::ExifTool) \
perl(Image::ExifTool::AES) \
perl(Image::ExifTool::AFCP) \
perl(Image::ExifTool::AIFF) \
perl(Image::ExifTool::APE) \
perl(Image::ExifTool::APP12) \
perl(Image::ExifTool::ASF) \
perl(Image::ExifTool::Apple) \
perl(Image::ExifTool::Audible) \
perl(Image::ExifTool::BMP) \
perl(Image::ExifTool::BPG) \
perl(Image::ExifTool::BZZ) \
perl(Image::ExifTool::BigTIFF) \
perl(Image::ExifTool::BuildTagLookup) \
perl(Image::ExifTool::CBOR) \
perl(Image::ExifTool::Canon) \
perl(Image::ExifTool::CanonCustom) \
perl(Image::ExifTool::CanonRaw) \
perl(Image::ExifTool::CanonVRD) \
perl(Image::ExifTool::CaptureOne) \
perl(Image::ExifTool::Casio) \
perl(Image::ExifTool::Charset) \
perl(Image::ExifTool::DICOM) \
perl(Image::ExifTool::DJI) \
perl(Image::ExifTool::DNG) \
perl(Image::ExifTool::DPX) \
perl(Image::ExifTool::DV) \
perl(Image::ExifTool::DarwinCore) \
perl(Image::ExifTool::DjVu) \
perl(Image::ExifTool::EXE) \
perl(Image::ExifTool::Exif) \
perl(Image::ExifTool::FITS) \
perl(Image::ExifTool::FLAC) \
perl(Image::ExifTool::FLIF) \
perl(Image::ExifTool::FLIR) \
perl(Image::ExifTool::Fixup) \
perl(Image::ExifTool::Flash) \
perl(Image::ExifTool::FlashPix) \
perl(Image::ExifTool::Font) \
perl(Image::ExifTool::FotoStation) \
perl(Image::ExifTool::FujiFilm) \
perl(Image::ExifTool::GE) \
perl(Image::ExifTool::GIF) \
perl(Image::ExifTool::GIMP) \
perl(Image::ExifTool::GPS) \
perl(Image::ExifTool::GeoTiff) \
perl(Image::ExifTool::Geotag) \
perl(Image::ExifTool::GoPro) \
perl(Image::ExifTool::H264) \
perl(Image::ExifTool::HP) \
perl(Image::ExifTool::HTML) \
perl(Image::ExifTool::HtmlDump) \
perl(Image::ExifTool::ICC_Profile) \
perl(Image::ExifTool::ICO) \
perl(Image::ExifTool::ID3) \
perl(Image::ExifTool::IPTC) \
perl(Image::ExifTool::ISO) \
perl(Image::ExifTool::ITC) \
perl(Image::ExifTool::Import) \
perl(Image::ExifTool::InDesign) \
perl(Image::ExifTool::InfiRay) \
perl(Image::ExifTool::JPEG) \
perl(Image::ExifTool::JPEGDigest) \
perl(Image::ExifTool::JSON) \
perl(Image::ExifTool::JVC) \
perl(Image::ExifTool::Jpeg2000) \
perl(Image::ExifTool::Kodak) \
perl(Image::ExifTool::KyoceraRaw) \
perl(Image::ExifTool::LIF) \
perl(Image::ExifTool::LNK) \
perl(Image::ExifTool::Lang::cs) \
perl(Image::ExifTool::Lang::de) \
perl(Image::ExifTool::Lang::en_ca) \
perl(Image::ExifTool::Lang::en_gb) \
perl(Image::ExifTool::Lang::es) \
perl(Image::ExifTool::Lang::fi) \
perl(Image::ExifTool::Lang::fr) \
perl(Image::ExifTool::Lang::it) \
perl(Image::ExifTool::Lang::ja) \
perl(Image::ExifTool::Lang::ko) \
perl(Image::ExifTool::Lang::nl) \
perl(Image::ExifTool::Lang::pl) \
perl(Image::ExifTool::Lang::ru) \
perl(Image::ExifTool::Lang::sk) \
perl(Image::ExifTool::Lang::sv) \
perl(Image::ExifTool::Lang::tr) \
perl(Image::ExifTool::Lang::zh_cn) \
perl(Image::ExifTool::Lang::zh_tw) \
perl(Image::ExifTool::Leaf) \
perl(Image::ExifTool::Lytro) \
perl(Image::ExifTool::M2TS) \
perl(Image::ExifTool::MIE) \
perl(Image::ExifTool::MIFF) \
perl(Image::ExifTool::MISB) \
perl(Image::ExifTool::MNG) \
perl(Image::ExifTool::MOI) \
perl(Image::ExifTool::MPC) \
perl(Image::ExifTool::MPEG) \
perl(Image::ExifTool::MPF) \
perl(Image::ExifTool::MRC) \
perl(Image::ExifTool::MWG) \
perl(Image::ExifTool::MXF) \
perl(Image::ExifTool::MacOS) \
perl(Image::ExifTool::MakerNotes) \
perl(Image::ExifTool::Matroska) \
perl(Image::ExifTool::Microsoft) \
perl(Image::ExifTool::Minolta) \
perl(Image::ExifTool::MinoltaRaw) \
perl(Image::ExifTool::Motorola) \
perl(Image::ExifTool::Nikon) \
perl(Image::ExifTool::NikonCapture) \
perl(Image::ExifTool::NikonCustom) \
perl(Image::ExifTool::NikonSettings) \
perl(Image::ExifTool::Nintendo) \
perl(Image::ExifTool::OOXML) \
perl(Image::ExifTool::Ogg) \
perl(Image::ExifTool::Olympus) \
perl(Image::ExifTool::OpenEXR) \
perl(Image::ExifTool::Opus) \
perl(Image::ExifTool::Other) \
perl(Image::ExifTool::PCX) \
perl(Image::ExifTool::PDF) \
perl(Image::ExifTool::PGF) \
perl(Image::ExifTool::PICT) \
perl(Image::ExifTool::PLIST) \
perl(Image::ExifTool::PLUS) \
perl(Image::ExifTool::PNG) \
perl(Image::ExifTool::PPM) \
perl(Image::ExifTool::PSP) \
perl(Image::ExifTool::Palm) \
perl(Image::ExifTool::Panasonic) \
perl(Image::ExifTool::PanasonicRaw) \
perl(Image::ExifTool::Parrot) \
perl(Image::ExifTool::Pentax) \
perl(Image::ExifTool::PhaseOne) \
perl(Image::ExifTool::PhotoCD) \
perl(Image::ExifTool::PhotoMechanic) \
perl(Image::ExifTool::Photoshop) \
perl(Image::ExifTool::PostScript) \
perl(Image::ExifTool::PrintIM) \
perl(Image::ExifTool::Qualcomm) \
perl(Image::ExifTool::QuickTime) \
perl(Image::ExifTool::RIFF) \
perl(Image::ExifTool::RSRC) \
perl(Image::ExifTool::RTF) \
perl(Image::ExifTool::Radiance) \
perl(Image::ExifTool::Rawzor) \
perl(Image::ExifTool::Real) \
perl(Image::ExifTool::Reconyx) \
perl(Image::ExifTool::Red) \
perl(Image::ExifTool::Ricoh) \
perl(Image::ExifTool::Samsung) \
perl(Image::ExifTool::Sanyo) \
perl(Image::ExifTool::Scalado) \
perl(Image::ExifTool::Shortcuts) \
perl(Image::ExifTool::Sigma) \
perl(Image::ExifTool::SigmaRaw) \
perl(Image::ExifTool::Sony) \
perl(Image::ExifTool::SonyIDC) \
perl(Image::ExifTool::Stim) \
perl(Image::ExifTool::TagInfoXML) \
perl(Image::ExifTool::TagLookup) \
perl(Image::ExifTool::Text) \
perl(Image::ExifTool::Theora) \
perl(Image::ExifTool::Torrent) \
perl(Image::ExifTool::Unknown) \
perl(Image::ExifTool::VCard) \
perl(Image::ExifTool::Validate) \
perl(Image::ExifTool::Vorbis) \
perl(Image::ExifTool::WPG) \
perl(Image::ExifTool::WTV) \
perl(Image::ExifTool::XMP) \
perl(Image::ExifTool::ZIP) \
perl(Image::ExifTool::ZISRAW) \
perl(Image::ExifTool::iWork) \
perl-Image-ExifTool"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(File::RandomAccess)"

inherit rpm
