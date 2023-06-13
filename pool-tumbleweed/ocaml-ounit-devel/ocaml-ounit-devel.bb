SUMMARY = "Development files for ocaml-ounit"
DESCRIPTION = "Development files needed for application based on ocaml-ounit."
LICENSE = "MIT"

PV = "2.2.7"

RPM_NAME = "ocaml-ounit-devel-2.2.7-1.1.aarch64.rpm"
RPM_HASH = "b213660247bfb936a3f3af872e42b36ceebd4d6ab039a6d03334726f5d92de5d2f5a0970a002ff752e722c7c15a7f39ab6bd1fd023749c99bf4ce3f1156f4a71"

RPROVIDES:${PN} += "ocaml(OUnit) \
ocaml(OUnit2) \
ocaml(OUnitAssert) \
ocaml(OUnitBracket) \
ocaml(OUnitCache) \
ocaml(OUnitCheckEnv) \
ocaml(OUnitChooser) \
ocaml(OUnitConf) \
ocaml(OUnitCore) \
ocaml(OUnitDiff) \
ocaml(OUnitLogger) \
ocaml(OUnitLoggerCI) \
ocaml(OUnitLoggerHTML) \
ocaml(OUnitLoggerHTMLData) \
ocaml(OUnitLoggerJUnit) \
ocaml(OUnitLoggerStd) \
ocaml(OUnitPlugin) \
ocaml(OUnitPropList) \
ocaml(OUnitResultSummary) \
ocaml(OUnitRunner) \
ocaml(OUnitRunnerProcesses) \
ocaml(OUnitShared) \
ocaml(OUnitState) \
ocaml(OUnitTest) \
ocaml(OUnitTestData) \
ocaml(OUnitThreads) \
ocaml(OUnitThreads__) \
ocaml(OUnitThreads__OUnitRunnerThreads) \
ocaml(OUnitUtils) \
ocaml-ounit-devel \
ocaml-ounit-devel(aarch-64) \
ocamlfind(oUnit) \
ocamlfind(oUnit.advanced) \
ocamlfind(oUnit.threads) \
ocamlfind(ounit) \
ocamlfind(ounit2) \
ocamlfind(ounit2.advanced) \
ocamlfind(ounit2.threads) \
ocamlx(OUnit) \
ocamlx(OUnit2) \
ocamlx(OUnitAssert) \
ocamlx(OUnitBracket) \
ocamlx(OUnitCache) \
ocamlx(OUnitCheckEnv) \
ocamlx(OUnitChooser) \
ocamlx(OUnitConf) \
ocamlx(OUnitCore) \
ocamlx(OUnitDiff) \
ocamlx(OUnitLogger) \
ocamlx(OUnitLoggerCI) \
ocamlx(OUnitLoggerHTML) \
ocamlx(OUnitLoggerHTMLData) \
ocamlx(OUnitLoggerJUnit) \
ocamlx(OUnitLoggerStd) \
ocamlx(OUnitPlugin) \
ocamlx(OUnitPropList) \
ocamlx(OUnitResultSummary) \
ocamlx(OUnitRunner) \
ocamlx(OUnitRunnerProcesses) \
ocamlx(OUnitShared) \
ocamlx(OUnitState) \
ocamlx(OUnitTest) \
ocamlx(OUnitTestData) \
ocamlx(OUnitThreads) \
ocamlx(OUnitThreads__) \
ocamlx(OUnitThreads__OUnitRunnerThreads) \
ocamlx(OUnitUtils)"

RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalOO) \
ocaml(Condition) \
ocaml(Event) \
ocaml(Mutex) \
ocaml(Stdlib) \
ocaml(Stdlib__Arg) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Complex) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Filename) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Gc) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Marshal) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Oo) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Scanf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Thread) \
ocaml(Unix) \
ocaml-ounit \
ocamlfind(seq) \
ocamlfind(stdlib-shims) \
ocamlfind(threads) \
ocamlfind(unix) \
ocamlx(CamlinternalOO) \
ocamlx(Condition) \
ocamlx(Event) \
ocamlx(Mutex) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Arg) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Char) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Gc) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Marshal) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Scanf) \
ocamlx(Stdlib__Seq) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
ocamlx(Thread) \
ocamlx(Unix)"

inherit rpm
