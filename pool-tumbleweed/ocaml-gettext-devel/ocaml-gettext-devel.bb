SUMMARY = "Development files for ocaml-gettext"
DESCRIPTION = "The ocaml-gettext-devel package contains libraries and signature files for \
developing applications that use ocaml-gettext."
LICENSE = "SUSE-LGPL-2.0-with-linking-exception"

PV = "0.4.2"

RPM_NAME = "ocaml-gettext-devel-0.4.2-3.11.aarch64.rpm"
RPM_HASH = "e8aee7e48326f72f8b4ce3a4f234c151ef9e358c85b916140b64a9a62d8a1352dfaeee572c4a99b153715c59170e88d5cdbc06fd1f2b491883ed5f99a33c2278"

RPROVIDES:${PN} += "ocaml(Gettext) \
ocaml(GettextCamomile) \
ocaml(GettextCategory) \
ocaml(GettextCharset) \
ocaml(GettextCompat) \
ocaml(GettextCompile) \
ocaml(GettextConfig) \
ocaml(GettextConfigGen) \
ocaml(GettextDomain) \
ocaml(GettextDummy) \
ocaml(GettextFormat) \
ocaml(GettextFormat_lexer) \
ocaml(GettextFormat_parser) \
ocaml(GettextLocale) \
ocaml(GettextLocale_lexer) \
ocaml(GettextLocale_parser) \
ocaml(GettextLocale_types) \
ocaml(GettextMo) \
ocaml(GettextMo_int32) \
ocaml(GettextMo_lexer) \
ocaml(GettextMo_parser) \
ocaml(GettextModules) \
ocaml(GettextPo) \
ocaml(GettextPoComment_lexer) \
ocaml(GettextPoComment_parser) \
ocaml(GettextPo_lexer) \
ocaml(GettextPo_parser) \
ocaml(GettextPo_utils) \
ocaml(GettextRealize) \
ocaml(GettextStub) \
ocaml(GettextStubCompat) \
ocaml(GettextTranslate) \
ocaml(GettextTypes) \
ocaml(GettextUtils) \
ocaml-gettext-camomile-devel \
ocaml-gettext-devel \
ocaml-gettext-devel(aarch-64) \
ocamlfind(gettext) \
ocamlfind(gettext-camomile) \
ocamlfind(gettext-stub) \
ocamlfind(gettext.base) \
ocamlfind(gettext.extension) \
ocamlx(Gettext) \
ocamlx(GettextCamomile) \
ocamlx(GettextCategory) \
ocamlx(GettextCharset) \
ocamlx(GettextCompat) \
ocamlx(GettextCompile) \
ocamlx(GettextConfig) \
ocamlx(GettextConfigGen) \
ocamlx(GettextDomain) \
ocamlx(GettextDummy) \
ocamlx(GettextFormat) \
ocamlx(GettextFormat_lexer) \
ocamlx(GettextFormat_parser) \
ocamlx(GettextLocale) \
ocamlx(GettextLocale_lexer) \
ocamlx(GettextLocale_parser) \
ocamlx(GettextLocale_types) \
ocamlx(GettextMo) \
ocamlx(GettextMo_int32) \
ocamlx(GettextMo_lexer) \
ocamlx(GettextMo_parser) \
ocamlx(GettextModules) \
ocamlx(GettextPo) \
ocamlx(GettextPoComment_lexer) \
ocamlx(GettextPoComment_parser) \
ocamlx(GettextPo_lexer) \
ocamlx(GettextPo_parser) \
ocamlx(GettextPo_utils) \
ocamlx(GettextRealize) \
ocamlx(GettextStub) \
ocamlx(GettextStubCompat) \
ocamlx(GettextTranslate) \
ocamlx(GettextTypes) \
ocamlx(GettextUtils)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamomileDefaultConfig) \
ocaml(CamomileDefaultConfig__) \
ocaml(CamomileDefaultConfig__InstallConfig) \
ocaml(CamomileLibrary) \
ocaml(CamomileLibraryDefault) \
ocaml(CamomileLibrary__) \
ocaml(CamomileLibrary__AvlTree) \
ocaml(CamomileLibrary__CaseMap) \
ocaml(CamomileLibrary__CharEncoding) \
ocaml(CamomileLibrary__ConfigInt) \
ocaml(CamomileLibrary__IMap) \
ocaml(CamomileLibrary__ISet) \
ocaml(CamomileLibrary__Locale) \
ocaml(CamomileLibrary__OOChannel) \
ocaml(CamomileLibrary__StringPrep) \
ocaml(CamomileLibrary__SubText) \
ocaml(CamomileLibrary__UCS4) \
ocaml(CamomileLibrary__UChar) \
ocaml(CamomileLibrary__UCharInfo) \
ocaml(CamomileLibrary__UCharTbl) \
ocaml(CamomileLibrary__UCol) \
ocaml(CamomileLibrary__ULine) \
ocaml(CamomileLibrary__UMap) \
ocaml(CamomileLibrary__UNF) \
ocaml(CamomileLibrary__UPervasives) \
ocaml(CamomileLibrary__URe) \
ocaml(CamomileLibrary__UReStr) \
ocaml(CamomileLibrary__USet) \
ocaml(CamomileLibrary__UTF16) \
ocaml(CamomileLibrary__UTF8) \
ocaml(CamomileLibrary__UText) \
ocaml(CamomileLibrary__UnicodeString) \
ocaml(CamomileLibrary__XString) \
ocaml(FilePath) \
ocaml(FileUtil) \
ocaml(Stdlib) \
ocaml(Stdlib__Arg) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Complex) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Filename) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Marshal) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Parsing) \
ocaml(Stdlib__Pervasives) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__Stream) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Unix) \
ocaml-gettext \
ocamlfind(camomile) \
ocamlfind(fileutils) \
ocamlx(CamomileLibraryDefault) \
ocamlx(FilePath) \
ocamlx(FileUtil) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Int32) \
ocamlx(Stdlib__Lexing) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Marshal) \
ocamlx(Stdlib__Parsing) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
ocamlx(Unix)"

inherit rpm
