SUMMARY = "Development files for ocaml-ounit"
DESCRIPTION = "Development files needed for application based on ocaml-ounit."
LICENSE = "MIT"

PV = "2.2.7"

RPM_NAME = "ocaml-ounit-devel-2.2.7-1.2.aarch64.rpm"
RPM_HASH = "8526f3284351b79efbce709cb36fe3ddf9d1ba18513f3283d4c980f332c969845bbc680b016321a8c616a8ce4a8a5f1953737b32c5cdbf73048b517c335bbdc3"

RPROVIDES:${PN} += "ocaml-OUnit \
ocaml-OUnit2 \
ocaml-OUnitAssert \
ocaml-OUnitBracket \
ocaml-OUnitCache \
ocaml-OUnitCheckEnv \
ocaml-OUnitChooser \
ocaml-OUnitConf \
ocaml-OUnitCore \
ocaml-OUnitDiff \
ocaml-OUnitLogger \
ocaml-OUnitLoggerCI \
ocaml-OUnitLoggerHTML \
ocaml-OUnitLoggerHTMLData \
ocaml-OUnitLoggerJUnit \
ocaml-OUnitLoggerStd \
ocaml-OUnitPlugin \
ocaml-OUnitPropList \
ocaml-OUnitResultSummary \
ocaml-OUnitRunner \
ocaml-OUnitRunnerProcesses \
ocaml-OUnitShared \
ocaml-OUnitState \
ocaml-OUnitTest \
ocaml-OUnitTestData \
ocaml-OUnitThreads \
ocaml-OUnitThreads-- \
ocaml-OUnitThreads--OUnitRunnerThreads \
ocaml-OUnitUtils \
ocaml-ounit-devel \
ocamlfind-oUnit \
ocamlfind-oUnit.advanced \
ocamlfind-oUnit.threads \
ocamlfind-ounit \
ocamlfind-ounit2 \
ocamlfind-ounit2.advanced \
ocamlfind-ounit2.threads \
ocamlx-OUnit \
ocamlx-OUnit2 \
ocamlx-OUnitAssert \
ocamlx-OUnitBracket \
ocamlx-OUnitCache \
ocamlx-OUnitCheckEnv \
ocamlx-OUnitChooser \
ocamlx-OUnitConf \
ocamlx-OUnitCore \
ocamlx-OUnitDiff \
ocamlx-OUnitLogger \
ocamlx-OUnitLoggerCI \
ocamlx-OUnitLoggerHTML \
ocamlx-OUnitLoggerHTMLData \
ocamlx-OUnitLoggerJUnit \
ocamlx-OUnitLoggerStd \
ocamlx-OUnitPlugin \
ocamlx-OUnitPropList \
ocamlx-OUnitResultSummary \
ocamlx-OUnitRunner \
ocamlx-OUnitRunnerProcesses \
ocamlx-OUnitShared \
ocamlx-OUnitState \
ocamlx-OUnitTest \
ocamlx-OUnitTestData \
ocamlx-OUnitThreads \
ocamlx-OUnitThreads-- \
ocamlx-OUnitThreads--OUnitRunnerThreads \
ocamlx-OUnitUtils"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalOO \
ocaml-Condition \
ocaml-Event \
ocaml-Mutex \
ocaml-Stdlib \
ocaml-Stdlib--Arg \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Format \
ocaml-Stdlib--Gc \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Marshal \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Oo \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Scanf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Thread \
ocaml-Unix \
ocaml-ounit \
ocamlfind-seq \
ocamlfind-stdlib-shims \
ocamlfind-threads \
ocamlfind-unix \
ocamlx-CamlinternalOO \
ocamlx-Condition \
ocamlx-Event \
ocamlx-Mutex \
ocamlx-Stdlib \
ocamlx-Stdlib--Arg \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Gc \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Marshal \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Scanf \
ocamlx-Stdlib--Seq \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Thread \
ocamlx-Unix"

inherit rpm
