SUMMARY = "Development files for opam"
DESCRIPTION = "The opam-devel package contains libraries and signature files for \
developing applications that use opam."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception"

PV = "2.1.5"

RPM_NAME = "opam-devel-2.1.5-1.1.aarch64.rpm"
RPM_HASH = "15471224e074daff40130fa48231fdbbac9528da906b33e7ee82f4f2a5d66052b30c97ba8c3d8956d939ce9d221bcb8e841e5d349957f31848c04ef504014c5f"

RPROVIDES:${PN} += "ocaml(OpamACL) \
ocaml(OpamAction) \
ocaml(OpamActionGraph) \
ocaml(OpamAdminCheck) \
ocaml(OpamAdminCommand) \
ocaml(OpamAdminRepoUpgrade) \
ocaml(OpamArg) \
ocaml(OpamArgTools) \
ocaml(OpamAuxCommands) \
ocaml(OpamBase64Compat) \
ocaml(OpamBuiltin0install) \
ocaml(OpamBuiltinMccs) \
ocaml(OpamBuiltinZ3) \
ocaml(OpamCLIVersion) \
ocaml(OpamCached) \
ocaml(OpamCliMain) \
ocaml(OpamClient) \
ocaml(OpamClientConfig) \
ocaml(OpamCommands) \
ocaml(OpamCompat) \
ocaml(OpamConfigCommand) \
ocaml(OpamConsole) \
ocaml(OpamCoreConfig) \
ocaml(OpamCudf) \
ocaml(OpamCudfSolver) \
ocaml(OpamCudfSolverSig) \
ocaml(OpamDarcs) \
ocaml(OpamDirTrack) \
ocaml(OpamDoseCompat) \
ocaml(OpamDownload) \
ocaml(OpamEnv) \
ocaml(OpamFile) \
ocaml(OpamFileTools) \
ocaml(OpamFilename) \
ocaml(OpamFilter) \
ocaml(OpamFormat) \
ocaml(OpamFormatConfig) \
ocaml(OpamFormatUpgrade) \
ocaml(OpamFormula) \
ocaml(OpamGit) \
ocaml(OpamGitVersion) \
ocaml(OpamGlobalState) \
ocaml(OpamHTTP) \
ocaml(OpamHash) \
ocaml(OpamHg) \
ocaml(OpamInitDefaults) \
ocaml(OpamInterpLexer) \
ocaml(OpamJson) \
ocaml(OpamLineLexer) \
ocaml(OpamListCommand) \
ocaml(OpamLocal) \
ocaml(OpamLockCommand) \
ocaml(OpamPackage) \
ocaml(OpamPackageVar) \
ocaml(OpamParallel) \
ocaml(OpamPath) \
ocaml(OpamPinCommand) \
ocaml(OpamPinned) \
ocaml(OpamPp) \
ocaml(OpamProcess) \
ocaml(OpamRepository) \
ocaml(OpamRepositoryBackend) \
ocaml(OpamRepositoryCommand) \
ocaml(OpamRepositoryConfig) \
ocaml(OpamRepositoryName) \
ocaml(OpamRepositoryPath) \
ocaml(OpamRepositoryState) \
ocaml(OpamSHA) \
ocaml(OpamScript) \
ocaml(OpamSolution) \
ocaml(OpamSolver) \
ocaml(OpamSolverConfig) \
ocaml(OpamSpdxList) \
ocaml(OpamStateConfig) \
ocaml(OpamStateTypes) \
ocaml(OpamStd) \
ocaml(OpamStubs) \
ocaml(OpamStubsTypes) \
ocaml(OpamSwitch) \
ocaml(OpamSwitchAction) \
ocaml(OpamSwitchCommand) \
ocaml(OpamSwitchState) \
ocaml(OpamSysInteract) \
ocaml(OpamSysPkg) \
ocaml(OpamSysPoll) \
ocaml(OpamSystem) \
ocaml(OpamTypes) \
ocaml(OpamTypesBase) \
ocaml(OpamUpdate) \
ocaml(OpamUrl) \
ocaml(OpamVCS) \
ocaml(OpamVariable) \
ocaml(OpamVersion) \
ocaml(OpamVersionCompare) \
ocaml(Opam_admin_top) \
ocamlfind(opam) \
ocamlfind(opam-admin) \
ocamlfind(opam-admin.top) \
ocamlfind(opam-client) \
ocamlfind(opam-core) \
ocamlfind(opam-format) \
ocamlfind(opam-installer) \
ocamlfind(opam-repository) \
ocamlfind(opam-solver) \
ocamlfind(opam-state) \
ocamlx(OpamACL) \
ocamlx(OpamAction) \
ocamlx(OpamActionGraph) \
ocamlx(OpamAdminCheck) \
ocamlx(OpamAdminCommand) \
ocamlx(OpamAdminRepoUpgrade) \
ocamlx(OpamArg) \
ocamlx(OpamArgTools) \
ocamlx(OpamAuxCommands) \
ocamlx(OpamBase64Compat) \
ocamlx(OpamBuiltin0install) \
ocamlx(OpamBuiltinMccs) \
ocamlx(OpamBuiltinZ3) \
ocamlx(OpamCLIVersion) \
ocamlx(OpamCached) \
ocamlx(OpamCliMain) \
ocamlx(OpamClient) \
ocamlx(OpamClientConfig) \
ocamlx(OpamCommands) \
ocamlx(OpamCompat) \
ocamlx(OpamConfigCommand) \
ocamlx(OpamConsole) \
ocamlx(OpamCoreConfig) \
ocamlx(OpamCudf) \
ocamlx(OpamCudfSolver) \
ocamlx(OpamCudfSolverSig) \
ocamlx(OpamDarcs) \
ocamlx(OpamDirTrack) \
ocamlx(OpamDoseCompat) \
ocamlx(OpamDownload) \
ocamlx(OpamEnv) \
ocamlx(OpamFile) \
ocamlx(OpamFileTools) \
ocamlx(OpamFilename) \
ocamlx(OpamFilter) \
ocamlx(OpamFormat) \
ocamlx(OpamFormatConfig) \
ocamlx(OpamFormatUpgrade) \
ocamlx(OpamFormula) \
ocamlx(OpamGit) \
ocamlx(OpamGitVersion) \
ocamlx(OpamGlobalState) \
ocamlx(OpamHTTP) \
ocamlx(OpamHash) \
ocamlx(OpamHg) \
ocamlx(OpamInitDefaults) \
ocamlx(OpamInterpLexer) \
ocamlx(OpamJson) \
ocamlx(OpamLineLexer) \
ocamlx(OpamListCommand) \
ocamlx(OpamLocal) \
ocamlx(OpamLockCommand) \
ocamlx(OpamPackage) \
ocamlx(OpamPackageVar) \
ocamlx(OpamParallel) \
ocamlx(OpamPath) \
ocamlx(OpamPinCommand) \
ocamlx(OpamPinned) \
ocamlx(OpamPp) \
ocamlx(OpamProcess) \
ocamlx(OpamRepository) \
ocamlx(OpamRepositoryBackend) \
ocamlx(OpamRepositoryCommand) \
ocamlx(OpamRepositoryConfig) \
ocamlx(OpamRepositoryName) \
ocamlx(OpamRepositoryPath) \
ocamlx(OpamRepositoryState) \
ocamlx(OpamSHA) \
ocamlx(OpamScript) \
ocamlx(OpamSolution) \
ocamlx(OpamSolver) \
ocamlx(OpamSolverConfig) \
ocamlx(OpamSpdxList) \
ocamlx(OpamStateConfig) \
ocamlx(OpamStd) \
ocamlx(OpamStubs) \
ocamlx(OpamStubsTypes) \
ocamlx(OpamSwitch) \
ocamlx(OpamSwitchAction) \
ocamlx(OpamSwitchCommand) \
ocamlx(OpamSwitchState) \
ocamlx(OpamSysInteract) \
ocamlx(OpamSysPkg) \
ocamlx(OpamSysPoll) \
ocamlx(OpamSystem) \
ocamlx(OpamTypesBase) \
ocamlx(OpamUpdate) \
ocamlx(OpamUrl) \
ocamlx(OpamVCS) \
ocamlx(OpamVariable) \
ocamlx(OpamVersion) \
ocamlx(OpamVersionCompare) \
ocamlx(Opam_admin_top) \
opam-devel \
opam-devel(aarch-64)"

RDEPENDS:${PN} += "ocaml(Base64) \
ocaml(Base64__) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(Cmdliner) \
ocaml(Cudf) \
ocaml(Cudf_conf) \
ocaml(Cudf_parser) \
ocaml(Cudf_printer) \
ocaml(Cudf_types) \
ocaml(Dose_algo) \
ocaml(Dose_algo__Defaultgraphs) \
ocaml(Dose_algo__Depsolver) \
ocaml(Dose_algo__Diagnostic) \
ocaml(Dose_common) \
ocaml(Dose_common__CudfAdd) \
ocaml(Dose_common__CudfSolver) \
ocaml(Dose_common__Util) \
ocaml(Enum) \
ocaml(ExtArray) \
ocaml(ExtBuffer) \
ocaml(ExtBytes) \
ocaml(ExtHashtbl) \
ocaml(ExtLib) \
ocaml(ExtList) \
ocaml(ExtString) \
ocaml(Graph) \
ocaml(Graph__) \
ocaml(Graph__Builder) \
ocaml(Graph__Components) \
ocaml(Graph__Dot) \
ocaml(Graph__Dot_ast) \
ocaml(Graph__Gml) \
ocaml(Graph__Graphml) \
ocaml(Graph__Graphviz) \
ocaml(Graph__Imperative) \
ocaml(Graph__Oper) \
ocaml(Graph__Sig) \
ocaml(Graph__Topological) \
ocaml(Graph__Traverse) \
ocaml(IO) \
ocaml(Mccs) \
ocaml(OpamBaseParser) \
ocaml(OpamLexer) \
ocaml(OpamParser) \
ocaml(OpamParserTypes) \
ocaml(OpamPrinter) \
ocaml(Option) \
ocaml(Re) \
ocaml(Re__) \
ocaml(Re__Automata) \
ocaml(Re__Category) \
ocaml(Re__Core) \
ocaml(Re__Cset) \
ocaml(Re__Glob) \
ocaml(Re__Group) \
ocaml(Re__Pcre) \
ocaml(Re__Pmark) \
ocaml(Std) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Complex) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Filename) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Int64) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Marshal) \
ocaml(Stdlib__Nativeint) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Parsing) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Queue) \
ocaml(Stdlib__Random) \
ocaml(Stdlib__Result) \
ocaml(Stdlib__Scanf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Unix) \
ocamlfind(base64) \
ocamlfind(bigarray) \
ocamlfind(cmdliner) \
ocamlfind(compiler-libs.toplevel) \
ocamlfind(cudf) \
ocamlfind(dose3.algo) \
ocamlfind(mccs) \
ocamlfind(ocamlgraph) \
ocamlfind(opam-file-format) \
ocamlfind(re) \
ocamlfind(unix) \
ocamlx(Base64) \
ocamlx(CamlinternalLazy) \
ocamlx(Cmdliner) \
ocamlx(Cudf) \
ocamlx(Cudf_parser) \
ocamlx(Cudf_printer) \
ocamlx(Dose_algo__Defaultgraphs) \
ocamlx(Dose_algo__Depsolver) \
ocamlx(Dose_algo__Diagnostic) \
ocamlx(Dose_common__CudfAdd) \
ocamlx(Dose_common__CudfSolver) \
ocamlx(Graph__Components) \
ocamlx(Graph__Graphviz) \
ocamlx(Graph__Imperative) \
ocamlx(Graph__Oper) \
ocamlx(Graph__Topological) \
ocamlx(Graph__Traverse) \
ocamlx(Mccs) \
ocamlx(OpamLexer) \
ocamlx(OpamParser) \
ocamlx(OpamPrinter) \
ocamlx(Re) \
ocamlx(Re__Glob) \
ocamlx(Re__Pcre) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Bigarray) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Char) \
ocamlx(Stdlib__Digest) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Int32) \
ocamlx(Stdlib__Int64) \
ocamlx(Stdlib__Lazy) \
ocamlx(Stdlib__Lexing) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Marshal) \
ocamlx(Stdlib__Parsing) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Queue) \
ocamlx(Stdlib__Random) \
ocamlx(Stdlib__Scanf) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
ocamlx(Stdlib__Uchar) \
ocamlx(Unix) \
opam"

inherit rpm
