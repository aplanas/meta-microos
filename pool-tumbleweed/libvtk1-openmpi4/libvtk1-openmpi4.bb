SUMMARY = "The Visualization Toolkit - A high level 3D visualization library"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This package provides the shared libraries for VTK."
LICENSE = "BSD-3-Clause"

PV = "9.2.6"

RPM_NAME = "libvtk1-openmpi4-9.2.6-2.2.aarch64.rpm"
RPM_HASH = "bcedd18c4264428b251a5286f6c4add6be6051155a8be1f88ba9a14b05fe5d0d9095d0b66b0b7405cc3fd9e755c41f87e53ae073d3430bb93d46b739185ac8c0"

RPROVIDES:${PN} += "libvtk1-openmpi4 \
libvtk1-openmpi4(aarch-64) \
libvtkChartsCore.so.1()(64bit) \
libvtkCommonColor.so.1()(64bit) \
libvtkCommonComputationalGeometry.so.1()(64bit) \
libvtkCommonCore.so.1()(64bit) \
libvtkCommonDataModel.so.1()(64bit) \
libvtkCommonExecutionModel.so.1()(64bit) \
libvtkCommonMath.so.1()(64bit) \
libvtkCommonMisc.so.1()(64bit) \
libvtkCommonSystem.so.1()(64bit) \
libvtkCommonTransforms.so.1()(64bit) \
libvtkDICOMParser.so.1()(64bit) \
libvtkDomainsChemistry.so.1()(64bit) \
libvtkDomainsChemistryOpenGL2.so.1()(64bit) \
libvtkDomainsParallelChemistry.so.1()(64bit) \
libvtkFiltersAMR.so.1()(64bit) \
libvtkFiltersCore.so.1()(64bit) \
libvtkFiltersExtraction.so.1()(64bit) \
libvtkFiltersFlowPaths.so.1()(64bit) \
libvtkFiltersGeneral.so.1()(64bit) \
libvtkFiltersGeneric.so.1()(64bit) \
libvtkFiltersGeometry.so.1()(64bit) \
libvtkFiltersHybrid.so.1()(64bit) \
libvtkFiltersHyperTree.so.1()(64bit) \
libvtkFiltersImaging.so.1()(64bit) \
libvtkFiltersModeling.so.1()(64bit) \
libvtkFiltersParallel.so.1()(64bit) \
libvtkFiltersParallelGeometry.so.1()(64bit) \
libvtkFiltersParallelImaging.so.1()(64bit) \
libvtkFiltersParallelMPI.so.1()(64bit) \
libvtkFiltersParallelVerdict.so.1()(64bit) \
libvtkFiltersPoints.so.1()(64bit) \
libvtkFiltersProgrammable.so.1()(64bit) \
libvtkFiltersSMP.so.1()(64bit) \
libvtkFiltersSelection.so.1()(64bit) \
libvtkFiltersSources.so.1()(64bit) \
libvtkFiltersStatistics.so.1()(64bit) \
libvtkFiltersTexture.so.1()(64bit) \
libvtkFiltersTopology.so.1()(64bit) \
libvtkFiltersVerdict.so.1()(64bit) \
libvtkGeovisCore.so.1()(64bit) \
libvtkIOAMR.so.1()(64bit) \
libvtkIOAsynchronous.so.1()(64bit) \
libvtkIOCGNSReader.so.1()(64bit) \
libvtkIOCONVERGECFD.so.1()(64bit) \
libvtkIOCesium3DTiles.so.1()(64bit) \
libvtkIOChemistry.so.1()(64bit) \
libvtkIOCityGML.so.1()(64bit) \
libvtkIOCore.so.1()(64bit) \
libvtkIOEnSight.so.1()(64bit) \
libvtkIOExodus.so.1()(64bit) \
libvtkIOExport.so.1()(64bit) \
libvtkIOExportPDF.so.1()(64bit) \
libvtkIOGeometry.so.1()(64bit) \
libvtkIOHDF.so.1()(64bit) \
libvtkIOImage.so.1()(64bit) \
libvtkIOImport.so.1()(64bit) \
libvtkIOInfovis.so.1()(64bit) \
libvtkIOLSDyna.so.1()(64bit) \
libvtkIOLegacy.so.1()(64bit) \
libvtkIOMINC.so.1()(64bit) \
libvtkIOMPIImage.so.1()(64bit) \
libvtkIOMPIParallel.so.1()(64bit) \
libvtkIOMovie.so.1()(64bit) \
libvtkIONetCDF.so.1()(64bit) \
libvtkIOOggTheora.so.1()(64bit) \
libvtkIOPLY.so.1()(64bit) \
libvtkIOParallel.so.1()(64bit) \
libvtkIOParallelNetCDF.so.1()(64bit) \
libvtkIOParallelXML.so.1()(64bit) \
libvtkIOSQL.so.1()(64bit) \
libvtkIOSegY.so.1()(64bit) \
libvtkIOTecplotTable.so.1()(64bit) \
libvtkIOVeraOut.so.1()(64bit) \
libvtkIOVideo.so.1()(64bit) \
libvtkIOXML.so.1()(64bit) \
libvtkIOXMLParser.so.1()(64bit) \
libvtkImagingColor.so.1()(64bit) \
libvtkImagingCore.so.1()(64bit) \
libvtkImagingFourier.so.1()(64bit) \
libvtkImagingGeneral.so.1()(64bit) \
libvtkImagingHybrid.so.1()(64bit) \
libvtkImagingMath.so.1()(64bit) \
libvtkImagingMorphological.so.1()(64bit) \
libvtkImagingSources.so.1()(64bit) \
libvtkImagingStatistics.so.1()(64bit) \
libvtkImagingStencil.so.1()(64bit) \
libvtkInfovisCore.so.1()(64bit) \
libvtkInfovisLayout.so.1()(64bit) \
libvtkInteractionImage.so.1()(64bit) \
libvtkInteractionStyle.so.1()(64bit) \
libvtkInteractionWidgets.so.1()(64bit) \
libvtkJava.so.1()(64bit) \
libvtkParallelCore.so.1()(64bit) \
libvtkParallelDIY.so.1()(64bit) \
libvtkParallelMPI.so.1()(64bit) \
libvtkParallelMPI4Py.so.1()(64bit) \
libvtkRenderingAnnotation.so.1()(64bit) \
libvtkRenderingContext2D.so.1()(64bit) \
libvtkRenderingContextOpenGL2.so.1()(64bit) \
libvtkRenderingCore.so.1()(64bit) \
libvtkRenderingFreeType.so.1()(64bit) \
libvtkRenderingFreeTypeFontConfig.so.1()(64bit) \
libvtkRenderingHyperTreeGrid.so.1()(64bit) \
libvtkRenderingImage.so.1()(64bit) \
libvtkRenderingLOD.so.1()(64bit) \
libvtkRenderingLabel.so.1()(64bit) \
libvtkRenderingOpenGL2.so.1()(64bit) \
libvtkRenderingSceneGraph.so.1()(64bit) \
libvtkRenderingUI.so.1()(64bit) \
libvtkRenderingVolume.so.1()(64bit) \
libvtkRenderingVolumeOpenGL2.so.1()(64bit) \
libvtkRenderingVtkJS.so.1()(64bit) \
libvtkTestingRendering.so.1()(64bit) \
libvtkViewsContext2D.so.1()(64bit) \
libvtkViewsCore.so.1()(64bit) \
libvtkViewsInfovis.so.1()(64bit) \
libvtkWrappingTools.so.1()(64bit) \
libvtkexodusII.so.1()(64bit) \
libvtkkissfft.so.1()(64bit) \
libvtkloguru.so.1()(64bit) \
libvtkmetaio.so.1()(64bit) \
libvtksys.so.1()(64bit) \
vtk-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libGLX.so.0()(64bit) \
libOpenGL.so.0()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcgns.so.4.3()(64bit) \
libdouble-conversion.so.3()(64bit) \
libexpat.so.1()(64bit) \
libfmt.so.9()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libhdf5.so.200()(64bit) \
libhpdf.so()(64bit) \
libjpeg.so.8()(64bit) \
libjsoncpp.so.25()(64bit) \
liblz4.so.1()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libmpi.so.40()(64bit) \
libnetcdf.so.19()(64bit) \
libogg.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libproj.so.25()(64bit) \
libpugixml.so.1()(64bit) \
libpython3.10.so.1.0()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtheoradec.so.1()(64bit) \
libtheoraenc.so.1()(64bit) \
libtiff.so.6()(64bit) \
libverdict.so.1.4()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
